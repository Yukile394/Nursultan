package minecraft;

import java.io.InputStream;

record class01063(class01622 packResources, class03652<InputStream> resource, int packIndex) {

   public int L() {
      return this.packIndex;
   }

   class01063(class01622 packResources, class03652<InputStream> resource, int packIndex) {
      this.packResources = packResources;
      this.resource = resource;
      this.packIndex = packIndex;
   }

   public class03652<InputStream> y() {
      return this.resource;
   }

   public class01622 N() {
      return this.packResources;
   }
}
