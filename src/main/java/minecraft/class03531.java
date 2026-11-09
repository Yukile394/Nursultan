package minecraft;

public record class03531(class03554 resourceManager, class01248 dataPackResources, class02003<class02969> registries, class05081 worldData)
   implements AutoCloseable {
   public class02003<class02969> L() {
      return this.registries;
   }

   public class03531(class03554 resourceManager, class01248 dataPackResources, class02003<class02969> registries, class05081 worldData) {
      this.resourceManager = resourceManager;
      this.dataPackResources = dataPackResources;
      this.registries = registries;
      this.worldData = worldData;
   }

   @Override
   public void close() {
      this.resourceManager.close();
   }

   public class05081 u() {
      return this.worldData;
   }

   public class01248 y() {
      return this.dataPackResources;
   }

   public class03554 N() {
      return this.resourceManager;
   }
}
