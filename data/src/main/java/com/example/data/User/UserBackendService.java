package com.example.data.User;

import com.example.domain.backendService.UserRepo;
import com.example.domain.interactor.ResponseCallback;
import com.example.domain.model.User;
import java.util.List;

public class UserBackendService implements UserRepo{
  @Override
  public void fetchListUserByDoctorId(String doctorId, ResponseCallback<List<User>> callback) {

  }
}
