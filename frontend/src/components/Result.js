import { useEffect, useState } from "react";
import { useLocation} from "react-router-dom";
import {makeStyles} from '@mui/styles';
import Grid from "@mui/material/Grid";
import abcjs  from "abcjs";

const useStyles = makeStyles(() => {
    return {
        score: {
            textDecoration: 'none',
            color: 'inherit',
        },
    }
});

const Result = () => {
    const classes = useStyles();
    const location = useLocation();
    const { sid } = location.state;
    const [list, setList] = useState([]);

    useEffect(() => {
        fetch(`/api/v1/scores/${sid}`)
            .then((response) => response.json())
            .then((list) => {
                setList(list);
                abcjs.renderAbc("score",  list.notation);
            });
    }, []);

    return (
        <div className="Result">
            <Grid xs={12}
                id="score"
                className={classes.score}
                  textAlign="center">

            </Grid>
        </div>
    );
}
export default Result;
