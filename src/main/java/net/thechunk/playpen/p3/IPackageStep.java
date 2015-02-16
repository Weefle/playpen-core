package net.thechunk.playpen.p3;

import org.json.JSONObject;

public interface IPackageStep {
    String getStepId();

    boolean runStep(PackageContext ctx, JSONObject config);
}