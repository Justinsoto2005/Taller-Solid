public class CloudAzure implements CloudServicePlatform{
    @Override
    public void hostingTo(AppWeb app){
        System.out.println("Connect to Microsoft Azure");
    }
}
