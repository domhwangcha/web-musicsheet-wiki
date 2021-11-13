import Grid from "@mui/material/Grid";

function Header() {
  return (
    <div className="Footer">
      <Grid
        container
        direction="row"
        justifyContent="center"
        alignItems="center"
      >
        <Grid textAlign="center">
          <h6>Copyright 2021. Domwhangcha. All rights reserved.</h6>
        </Grid>
      </Grid>
    </div>
  );
}
export default Header;
