package com.bozsandris.awsimageupload.datastore;

import com.bozsandris.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("62ab0694-df7d-484d-a9f3-24788761c5e4"), "adamsmith", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("4cda9b8b-7c45-4862-8792-a205b6a8e821"), "jessicajones", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
