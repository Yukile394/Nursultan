package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult.Error;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01611 implements class01622 {
   private static final Logger N = LogUtils.getLogger();
   private final class02267 u;
   private final class02955 i;
   private final Set<String> R;
   private final List<Path> M;
   private final Map<class01603, List<Path>> B;

   class01611(class02267 var1, class02955 var2, Set<String> var3, List<Path> var4, Map<class01603, List<Path>> var5) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
      this.M = var4;
      this.B = var5;
   }

   @Override
   public void close() {
   }

   public class02857 y() {
      return var1 -> Optional.ofNullable(this.method_14405(class01603.field_14188, var1)).map(var1x -> new class01079(this, (class03652<InputStream>)var1x));
   }

   public void N(class01603 var1, class01894 var2, Consumer<Path> var3) {
      class06290.i(var2.N()).ifSuccess(var4 -> {
         String s = var2.y();
         Iterator iterator = this.B.get(var1).iterator();

         while (iterator.hasNext()) {
            Path path = ((Path)iterator.next()).resolve(s);
            var3.accept(class06290.N(path, var4));
         }
      }).ifError(var1x -> N.error("Invalid path {}: {}", var2, var1x.message()));
   }

   private static void N(class01593 var0, String var1, Path var2, List<String> var3) {
      Path path = var2.resolve(var1);
      class01592.N(var1, path, var3, var0);
   }

   @Nullable
   @Override
   public class03652<InputStream> method_14410(String... var1) {
      class06290.N(var1);
      List list = List.of(var1);
      Iterator iterator = this.M.iterator();

      while (iterator.hasNext()) {
         Path path = class06290.N((Path)iterator.next(), list);
         if (Files.exists(path) && class01592.N(path)) {
            return class03652.N(path);
         }
      }

      return null;
   }

   @Override
   public class02267 method_56926() {
      return this.u;
   }

   @Override
   public Set<String> method_14406(class01603 var1) {
      return this.R;
   }

   @Nullable
   @Override
   public class03652<InputStream> method_14405(class01603 var1, class01894 var2) {
      return (class03652<InputStream>)class06290.i(var2.N()).mapOrElse(var3 -> {
         String s = var2.y();
         Iterator iterator = this.B.get(var1).iterator();

         while (iterator.hasNext()) {
            Path path = class06290.N(((Path)iterator.next()).resolve(s), var3);
            if (Files.exists(path) && class01592.N(path)) {
               return class03652.N(path);
            }
         }

         return null;
      }, var1x -> {
         N.error("Invalid path {}: {}", var2, var1x.message());
         return null;
      });
   }

   @Override
   public void method_14408(class01603 var1, String var2, String var3, class01593 var4) {
      class06290.i(var3).ifSuccess(var4x -> {
         List list = this.B.get(var1);
         int ix = list.size();
         if (ix == 1) {
            N(var4, var2, (Path)list.get(0), var4x);
         } else if (ix > 1) {
            HashMap hashmap = new HashMap();

            for (int j = 0; j < ix - 1; j++) {
               N(hashmap::putIfAbsent, var2, (Path)list.get(j), var4x);
            }

            Path path = (Path)list.get(ix - 1);
            if (hashmap.isEmpty()) {
               N(var4, var2, path, var4x);
            } else {
               N(hashmap::putIfAbsent, var2, path, var4x);
               hashmap.forEach(var4);
            }
         }
      }).ifError(var1x -> N.error("Invalid path {}: {}", var3, var1x.message()));
   }

   @Nullable
   @Override
   public <T> T method_14407(class02968<T> var1) {
      class03652 class03652 = this.method_14410("pack.mcmeta");
      if (class03652 != null) {
         try (InputStream inputstream = (InputStream)class03652.get()) {
            Object object = class01598.method_14392(var1, inputstream, this.u);
            if (object != null) {
               return (T)object;
            }

            return this.i.N(var1);
         } catch (IOException ioexception) {
         }
      }

      return this.i.N(var1);
   }
}
