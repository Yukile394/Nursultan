package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class06172 implements AutoCloseable {
   private final class05918 N;
   private final DataFixer y;
   private final class05715 L;
   private final Supplier<class06820> u;

   public class06172(class02277 var1, Path var2, DataFixer var3, boolean var4, class05715 var5) {
      this(var1, var2, var3, var4, var5, class06820.N);
   }

   public class06172(class02277 var1, Path var2, DataFixer var3, boolean var4, class05715 var5, Supplier<class06820> var6) {
      super();
      this.y = var3;
      this.L = var5;
      this.N = new class05918(var1, var2, var4);
      this.u = Suppliers.memoize(var6::get);
   }

   protected void i(class07321 var1) {
      this.u.get().N(var1);
   }

   public class02277 m() {
      return this.N.N();
   }

   @Override
   public void close() throws IOException {
      this.N.close();
   }

   public CompletableFuture<Optional<class07001>> u(class07321 var1) {
      return this.N.N(var1);
   }

   public CompletableFuture<Void> y(boolean var1) {
      return this.N.N(var1);
   }

   public boolean y(class07321 var1, int var2) {
      return this.N.N(var1, var2);
   }

   public CompletableFuture<Void> N(class07321 var1, Supplier<class07001> var2) {
      this.i(var1);
      return this.N.N(var1, var2);
   }

   public CompletableFuture<Void> N(class07321 var1, class07001 var2) {
      return this.N(var1, () -> var2);
   }

   public Dynamic<class07709> N(Dynamic<class07709> var1, int var2) {
      return new Dynamic(var1.getOps(), this.N((class07001)var1.getValue(), var2, null));
   }

   public static void N(class07001 var0, @Nullable class07001 var1) {
      if (var1 != null) {
         var0.N("__context", var1);
      }
   }

   public class07001 N(class07001 var1, int var2) {
      return this.N(var1, var2, null);
   }

   private static void N(class07001 var0) {
      var0.b("__context");
   }

   public class07001 N(class07001 var1, int var2, @Nullable class07001 var3) {
      int i = class07717.y(var1, var2);
      if (i == class07529.y().comp_4026().y()) {
         return var1;
      } else {
         try {
            var1 = this.u.get().applyFix(var1);
            N(var1, var3);
            var1 = this.L.N(this.y, var1, Math.max(this.u.get().N(), i));
            N(var1);
            class07717.i(var1);
            return var1;
         } catch (Exception exception) {
            class07080 class07080 = class07080.N(exception, "Updated chunk");
            class07080.N("Updated chunk details").N("Data version", i);
            throw new class07878(class07080);
         }
      }
   }

   public class03190 W() {
      return this.N;
   }
}
