package com.visenze.visearch.internal;

import com.visenze.visearch.Image;
import com.visenze.visearch.InsertStatus;
import com.visenze.visearch.InsertTrans;

import java.util.List;

public interface DataOperations {

    InsertTrans insert(List<Image> imageList);

    InsertStatus insertStatus(String transId);

    InsertStatus insertStatus(String transId, Integer errorPage, Integer errorLimit);

    void remove(List<String> imNameList);

}