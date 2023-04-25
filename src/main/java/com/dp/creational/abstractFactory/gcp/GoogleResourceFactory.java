package com.dp.creational.abstractFactory.gcp;


import com.dp.creational.abstractFactory.Instance;
import com.dp.creational.abstractFactory.ResourceFactory;
import com.dp.creational.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int storageSizeInMb) {
        return new GoogleCloudStorage(storageSizeInMb);
    }
}
