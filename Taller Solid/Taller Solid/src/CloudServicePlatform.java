public class CloudServicePlatform{
    private CloudProvider provider;

    public CloudServicePlatform(CloudProvider provider){
        this.provider = provider;
    }

    public void hostingTo(AppWeb app){
        provider.host(app);
    }
}