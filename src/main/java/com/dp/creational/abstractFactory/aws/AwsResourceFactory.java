package com.dp.creational.abstractFactory.aws;


import com.dp.creational.abstractFactory.Instance;
import com.dp.creational.abstractFactory.ResourceFactory;
import com.dp.creational.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int storageSizeInMb) {
        return new S3Storage(storageSizeInMb);
    }
}
