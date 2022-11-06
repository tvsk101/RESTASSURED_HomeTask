package example;

import model.NewUserRequestModelWithTimeAndId;
import model.UserRequestModel;

public class StepUser {


    ApiUser apiUser = new ApiUser();


    public NewUserRequestModelWithTimeAndId createUser(String name, String job){
        UserRequestModel model = new UserRequestModel(name, job);
        return apiUser.createUser(model);

    }


}
