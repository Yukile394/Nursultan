package minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public interface class01622 extends AutoCloseable {
   String y = ".mcmeta";
   String L = "pack.mcmeta";

   @Override
   void close();

   default Optional<class02298> N() {
      return this.method_56926().u();
   }

   default String method_14409() {
      return this.method_56926().N();
   }

   @Nullable
   class03652<InputStream> method_14410(String... var1);

   class02267 method_56926();

   Set<String> method_14406(class01603 var1);

   @Nullable
   class03652<InputStream> method_14405(class01603 var1, class01894 var2);

   void method_14408(class01603 var1, String var2, String var3, class01593 var4);

   @Nullable
   <T> T method_14407(class02968<T> var1) throws IOException;
}
