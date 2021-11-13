import {Link} from 'react-router-dom';
import Grid from "@mui/material/Grid";
import {makeStyles} from "@mui/styles";

const useStyles = makeStyles(() => {
    return {
        link: {
            textDecoration: 'none',
            color: 'inherit',
        },
    }
});

function Header() {
    const classes = useStyles();

    return (
        <div className="Header">
            <Link
                key={`header`}
                className={classes.link}
                to={{
                    pathname: `/`
                }}
            >
            <Grid container
                  direction="row"
                  justifyContent="center"
                  alignItems="center"
            >
                <Grid
                    textAlign="center">
                    <h2>WEB-SHEET MUSIC</h2>
                </Grid>
            </Grid>
            </Link>
        </div>
    )
}

export default Header;

