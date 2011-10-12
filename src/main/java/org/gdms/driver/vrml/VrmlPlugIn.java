package org.gdms.driver.vrml;

import org.gdms.data.DataSourceFactory;
import org.gdms.plugins.GdmsPlugIn;

public class VrmlPlugIn implements GdmsPlugIn {

       private DataSourceFactory dsf;

        @Override
        public void load(DataSourceFactory dsf) {
                this.dsf = dsf;
                dsf.getSourceManager().getDriverManager().registerDriver(VrmlDriver.class);
        }

        @Override
        public void unload() {
                dsf.getSourceManager().getDriverManager().unregisterDriver("VRML driver");
        }

        @Override
        public String getName() {
                return "VRML driver plugin";
        }

        @Override
        public String getVersion() {
                return "1.0";
        }
}
