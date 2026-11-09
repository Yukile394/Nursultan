package minecraft;

import Nursultan.class11922;
import Nursultan.class11930;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04563 {
   private static final Logger N = LogUtils.getLogger();
   private static final class08214 y = new class08214(class07536.B(), "server-list-io");
   private static final int L = 16;
   private final class06202 u;
   private final List<class04568> i = Lists.newArrayList();
   private final List<class04568> R = Lists.newArrayList();

   public int L() {
      return this.i.size();
   }

   public class04563(class06202 var1) {
      super();
      this.u = var1;
   }

   public static void y(class04568 var0) {
      y.N(() -> {
         class04563 class04563 = new class04563(class06202.Nq());
         class04563.N();
         if (!N(var0, class04563.i)) {
            N(var0, class04563.R);
         }

         class04563.y();
      });
   }

   public void y() {
      try {
         class07741 class07741 = new class07741();

         for (class04568 class04568x : this.N(this)) {
            class07001 class07001xx = class04568x.N();
            class07001xx.N("hidden", false);
            class07741.add(class07001xx);
         }

         for (class04568 class04568 : this.R) {
            class07001 class07001 = class04568.N();
            class07001.N("hidden", true);
            class07741.add(class07001);
         }

         class07001 class07001x = new class07001();
         class07001x.N("servers", class07741);
         Path path1 = ((File)this.u.l_1).toPath();
         Path path2 = Files.createTempFile(path1, "servers", ".dat");
         class07742.y(class07001x, path2);
         Path path = path1.resolve("servers.dat_old");
         class07536.N(path1.resolve("servers.dat"), path2, path);
      } catch (Exception exception) {
         N.error("Couldn't save server list", exception);
      }
   }

   @Nullable
   public class04568 y(String var1) {
      for (int ix = 0; ix < this.R.size(); ix++) {
         class04568 class04568 = this.R.get(ix);
         if (class04568.y.equals(var1)) {
            this.R.remove(ix);
            this.i.add(class04568);
            return class04568;
         }
      }

      return null;
   }

   private void N(CallbackInfo var1) {
      ((List)class11922.N_0).forEach(var0 -> var0.N(class04579.field_47880));
      this.i.addAll((List)class11922.N_0);
   }

   private List N(class04563 var1) {
      return this.i.stream().filter(var0 -> !(var0 instanceof class11930)).toList();
   }

   public void N(class04568 var1) {
      if (!this.i.remove(var1)) {
         this.R.remove(var1);
      }
   }

   @Nullable
   public class04568 N(String var1) {
      for (class04568 class04568x : this.i) {
         if (class04568x.y.equals(var1)) {
            return class04568x;
         }
      }

      for (class04568 class04568x : this.R) {
         if (class04568x.y.equals(var1)) {
            return class04568x;
         }
      }

      return null;
   }

   public class04568 N(int var1) {
      return this.i.get(var1);
   }

   public void N() {
      try {
         this.i.clear();
         List list = this.R;
         this.N(null);
         list.clear();
         class07001 class07001 = class07742.N(((File)this.u.l_1).toPath().resolve("servers.dat"));
         if (class07001 == null) {
            return;
         }

         class07001.s("servers").z().forEach(var1x -> {
            class04568 class04568 = class04568.N(var1x);
            if (var1x.y("hidden", false)) {
               this.R.add(class04568);
            } else {
               this.i.add(class04568);
            }
         });
      } catch (Exception exception) {
         N.error("Couldn't load server list", exception);
      }
   }

   private static boolean N(class04568 var0, List<class04568> var1) {
      for (int ix = 0; ix < var1.size(); ix++) {
         class04568 class04568 = (class04568)var1.get(ix);
         if (Objects.equals(class04568.N, var0.N) && class04568.y.equals(var0.y)) {
            var1.set(ix, var0);
            return true;
         }
      }

      return false;
   }

   public void N(int var1, class04568 var2) {
      this.i.set(var1, var2);
   }

   public void N(int var1, int var2) {
      class04568 class04568 = this.N(var1);
      this.i.set(var1, this.N(var2));
      this.i.set(var2, class04568);
      this.y();
   }

   public void N(class04568 var1, boolean var2) {
      if (var2) {
         this.R.add(0, var1);

         while (this.R.size() > 16) {
            this.R.remove(this.R.size() - 1);
         }
      } else {
         this.i.add(var1);
      }
   }
}
