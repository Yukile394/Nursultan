package minecraft;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

record class02991(Map<String, class02991> children, Map<String, Path> files) {

   public class02991() {
      this(new HashMap<>(), new HashMap<>());
   }

   private class02991(Map<String, class02991> children, Map<String, Path> files) {
      super();
      this.children = children;
      this.files = files;
   }

   public Map<String, Path> y() {
      return this.files;
   }

   public Map<String, class02991> N() {
      return this.children;
   }
}
