package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

record class01059(class01894 fileLocation, class01894 metadataLocation, List<class01071> fileSources, Map<class01622, class03652<InputStream>> metaSources) {

   public List<class01071> L() {
      return this.fileSources;
   }

   class01059(class01894 var1) {
      this(var1, class01066.y(var1), new ArrayList<>(), new Object2ObjectArrayMap());
   }

   private class01059(class01894 fileLocation, class01894 metadataLocation, List<class01071> fileSources, Map<class01622, class03652<InputStream>> metaSources) {
      super();
      this.fileLocation = fileLocation;
      this.metadataLocation = metadataLocation;
      this.fileSources = fileSources;
      this.metaSources = metaSources;
   }

   public Map<class01622, class03652<InputStream>> u() {
      return this.metaSources;
   }

   public class01894 y() {
      return this.metadataLocation;
   }

   public class01894 N() {
      return this.fileLocation;
   }
}
