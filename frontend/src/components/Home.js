import {useEffect, useState} from "react";
import {Link} from 'react-router-dom';
import Grid from "@mui/material/Grid";
import Paper from "@mui/material/Paper";
import {makeStyles} from '@mui/styles';

const useStyles = makeStyles(() => {
    return {
        link: {
            textDecoration: 'none',
            color: 'inherit',
        },
    }
});

const Home = () => {
    const classes = useStyles();
    const [list, setList] = useState([]);
    useEffect(() => {
        fetch("/api/v1/scores")
            .then((response) => response.json())
            .then((list) => {
                setList(list);
            });
    }, []);

    return (
        <div className="Home">
            {list !== undefined
                ? list.map((score) => {
                    return (
                        <Paper key={score.sid}>
                            <Grid
                                container
                                direction="row"
                                justifyContent="center"
                                alignItems="center"
                            >
                                <Grid xs={4}>
                                    <Grid textAlign="center">{score.sid}</Grid>
                                </Grid>

                                <Grid xs={8}>
                                    <Link
                                        key={`home-list-${score.sid}`}
                                        className={classes.link}
                                        to={{
                                            pathname: `./result/${score.sid}`
                                        }}
                                        state={{sid: score.sid}}
                                    >
                                        <Grid textAlign="center">
                                            <h6>{score.title}</h6>
                                            <h6>{score.writer !== "" ? score.writer : "미상"}</h6>
                                        </Grid>
                                    </Link>
                                </Grid>
                            </Grid>
                        </Paper>
                    );
                })
                : null}
        </div>
    );
}
export default Home;
