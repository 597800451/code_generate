package com.freemark.model.data.react;

import com.freemark.model.data.DefaultModel;
import com.freemark.utils.DbCluomsFormat;

public class AddAndEditModel extends DefaultModel {
    private static final String PREFIX = "modal";

    @Override
    public void initModel() {
        super.initModel();
        setModelName(PREFIX);
        this.map.put("className",getModelName());
        StringBuilder className = new StringBuilder(systemConfig.getKey("DB_TABLE_NAME"));
        map.put("class", DbCluomsFormat.humpFormat(className.toString()));
    }

    @Override
    public String getOutPathName() {
        return systemConfig.getKey("REACT_MODAL_OUT_PATH") + "\\" + setModelNameBySUFFIX2("");
    }
}
