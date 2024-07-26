package com.oneliferp.cwu.modules.session.misc;

import java.util.HashMap;
import java.util.Map;

public enum SessionButtonType {
    START("cwu_session_start"),
    CANCEL("cwu_session_cancel"),
    SUBMIT("cwu_session_submit"),
    EDIT("cwu_session_edit"),
    PREVIEW("cwu_session_preview"),
    CLEAR("cwu_session_clear"),
    PAGE("cwu_session_page"),
    FILL("cwu_session_fill");

    /*
    Perform easy lookup
    */
    private static final Map<String, SessionButtonType> IDS = new HashMap<>();
    static {
        for (final var type : values()) {
            IDS.put(type.getId(), type);
        }
    }

    public static SessionButtonType fromId(final String id) {
        final var type = IDS.get(id);
        if (type == null) throw new IllegalArgumentException("No enum constant with id " + id);
        return type;
    }

    private final String id;

    SessionButtonType(final String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
