package com.dp.creational.abstractFactory;


import com.dp.creational.abstractFactory.aws.AwsResourceFactory;
import com.dp.creational.abstractFactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createInstance(Instance.Capacity capacity, int storageSizeInMb){
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageSizeInMb);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
    	Client awsClient = new Client(new AwsResourceFactory());
        Instance i1 = awsClient.createInstance(Instance.Capacity.micro, 512);
        i1.start();
        i1.stop();

        Client gcpClient = new Client(new GoogleResourceFactory());
        Instance i2= gcpClient.createInstance(Instance.Capacity.small, 512);
        i2.start();
        i2.stop();
    }

}
