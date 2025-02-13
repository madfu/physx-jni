package de.fabmax.physxjni;

import java.util.ArrayList;
import java.util.List;

public class NativeMetaMacos implements NativeMeta {

    private static final String version = "1.1.0";

    private static final List<String> libraries = new ArrayList<String>() {{
        add("macos/libPhysXJniBindings_64.dylib");
    }};

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public List<String> getLibResources() {
        return libraries;
    }
}
