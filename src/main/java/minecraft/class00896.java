package minecraft;

import java.util.Map;
import org.jspecify.annotations.Nullable;

public record class00896(class03543<class00891> tag, Map<String, String> vagueProperties, class07001 nbt) {
   @Nullable
   public class07001 L() {
      return this.nbt;
   }

   public class00896(class03543<class00891> tag, Map<String, String> vagueProperties, @Nullable class07001 nbt) {
      super();
      this.tag = tag;
      this.vagueProperties = vagueProperties;
      this.nbt = nbt;
   }

   public Map<String, String> y() {
      return this.vagueProperties;
   }

   public class03543<class00891> N() {
      return this.tag;
   }
}
