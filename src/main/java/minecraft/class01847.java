package minecraft;

import java.net.URL;
import java.util.UUID;

record class01847(UUID id, URL url, String hash) {

   public String L() {
      return this.hash;
   }

   class01847(UUID id, URL url, String hash) {
      this.id = id;
      this.url = url;
      this.hash = hash;
   }

   public URL y() {
      return this.url;
   }

   public UUID N() {
      return this.id;
   }
}
