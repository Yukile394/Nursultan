package minecraft;

import java.io.InputStream;

record class01071(class01622 source, class03652<InputStream> resource) {

   class01071(class01622 source, class03652<InputStream> resource) {
      super();
      this.source = source;
      this.resource = resource;
   }

   public class03652<InputStream> y() {
      return this.resource;
   }

   public class01622 N() {
      return this.source;
   }
}
