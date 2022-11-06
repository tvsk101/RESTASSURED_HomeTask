import example.StepUser;
import model.NewUserRequestModelWithTimeAndId;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPost {

    StepUser stepUser = new StepUser();
    NewUserRequestModelWithTimeAndId model;



    @Test
    public void firstTest() {
        model = stepUser.createUser("NewName", "NewJob");

        Assert.assertEquals(model.getName(), "NewName");
        Assert.assertEquals(model.getJob(), "NewJob");
    }

}
