package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;

record class00144(
   class08890 bakedModels,
   Object2IntMap<class00500> modelGroups,
   Map<class00500, class08887> modelCache,
   class01140 entityModelSet,
   class08836 specialBlockModelRenderer
) {

   public Map<class00500, class08887> L() {
      return this.modelCache;
   }

   class00144(
      class08890 bakedModels,
      Object2IntMap<class00500> modelGroups,
      Map<class00500, class08887> modelCache,
      class01140 entityModelSet,
      class08836 specialBlockModelRenderer
   ) {
      super();
      this.bakedModels = bakedModels;
      this.modelGroups = modelGroups;
      this.modelCache = modelCache;
      this.entityModelSet = entityModelSet;
      this.specialBlockModelRenderer = specialBlockModelRenderer;
   }

   public class08836 i() {
      return this.specialBlockModelRenderer;
   }

   public class01140 u() {
      return this.entityModelSet;
   }

   public Object2IntMap<class00500> y() {
      return this.modelGroups;
   }

   public class08890 N() {
      return this.bakedModels;
   }
}
