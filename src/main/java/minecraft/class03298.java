package minecraft;

public record class03298(class01089 resourceManager, class01042 registryAccess, class01224 structureTemplateManager) {
   public class01224 L() {
      return this.structureTemplateManager;
   }

   public class03298(class01089 resourceManager, class01042 registryAccess, class01224 structureTemplateManager) {
      this.resourceManager = resourceManager;
      this.registryAccess = registryAccess;
      this.structureTemplateManager = structureTemplateManager;
   }

   public class01042 y() {
      return this.registryAccess;
   }

   public class01089 N() {
      return this.resourceManager;
   }

   public static class03298 N(class04782 var0) {
      class02796 class02796 = var0.method_8503();
      return new class03298(class02796.yw(), class02796.yt(), class02796.yv());
   }
}
