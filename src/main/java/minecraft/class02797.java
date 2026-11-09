package minecraft;

public record class02797(class03554 resourceManager, class01248 managers) implements AutoCloseable {

   public class02797(class03554 resourceManager, class01248 managers) {
      this.resourceManager = resourceManager;
      this.managers = managers;
   }

   @Override
   public void close() {
      this.resourceManager.close();
   }

   public class01248 y() {
      return this.managers;
   }

   public class03554 N() {
      return this.resourceManager;
   }
}
