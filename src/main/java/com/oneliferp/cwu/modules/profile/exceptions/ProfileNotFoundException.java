package com.oneliferp.cwu.modules.profile.exceptions;

import com.oneliferp.cwu.exceptions.CwuException;

public class ProfileNotFoundException extends CwuException {
    @Override
    public String getMessage() {
        return "Ce profil n'existe pas dans notre registre.";
    }
}
