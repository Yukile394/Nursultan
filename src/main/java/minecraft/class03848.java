package minecraft;

import com.google.common.hash.HashCode;
import java.net.URL;
import org.jspecify.annotations.Nullable;

public record class03848(URL url, HashCode hash) {

   public class03848(URL url, @Nullable HashCode hash) {
      super();
      this.url = url;
      this.hash = hash;
   }

   @Nullable
   public HashCode y() {
      return this.hash;
   }

   public URL N() {
      return this.url;
   }
}
