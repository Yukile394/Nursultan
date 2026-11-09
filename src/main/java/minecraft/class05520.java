package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05520 {
   public static final int N = 8;
   private static final Logger i = LogUtils.getLogger();
   final class04782 y;
   private final class05492 R;
   private final List<class05513> M;
   private ImmutableList<class05531> B;
   final List<class04251> L = Lists.newArrayList();
   private final List<class05513> Z = Lists.newArrayList();
   private final class05498 z;
   private boolean U = true;
   @Nullable
   private class03556<class00225> E;
   private final class05516 W;
   private final class05516 m;
   final boolean u;
   private final boolean P;

   public void L() {
      this.U = true;
      if (this.E != null) {
         this.u();
      }
   }

   protected class05520(
      class05498 var1, Collection<class05531> var2, class04782 var3, class05492 var4, class05516 var5, class05516 var6, boolean var7, boolean var8
   ) {
      super();
      this.y = var3;
      this.R = var4;
      this.z = var1;
      this.W = var5;
      this.m = var6;
      this.B = ImmutableList.copyOf(var2);
      this.u = var7;
      this.P = var8;
      this.M = this.B.stream().flatMap(var0 -> var0.y().stream()).collect(class07536.y());
      var4.N(this);
      this.M.forEach(var0 -> var0.N(new class04797()));
   }

   private void i() {
      if (!this.Z.isEmpty()) {
         i.info("Starting re-run of tests: {}", this.Z.stream().map(var0 -> var0.y().toString()).collect(Collectors.joining(", ")));
         this.B = ImmutableList.copyOf(this.z.batch(this.Z));
         this.Z.clear();
         this.U = false;
         this.N(0);
      } else {
         this.B = ImmutableList.of();
         this.U = true;
      }
   }

   void u() {
      if (this.E != null) {
         this.E.N().y(this.y);
         this.E = null;
      }
   }

   private Optional<class05513> y(class05513 var1) {
      return var1.L() == null ? this.m.spawnStructure(var1) : this.W.spawnStructure(var1);
   }

   public void y() {
      this.U = false;
      this.N(0);
   }

   private Collection<class05513> N(Collection<class05513> var1) {
      return var1.stream().map(this::y).flatMap(Optional::stream).toList();
   }

   public void N(class05513 var1) {
      class05513 class05513 = var1.O();
      var1.Q().forEach(var3 -> var3.N(var1, class05513, this));
      this.M.add(class05513);
      this.Z.add(class05513);
      if (this.U) {
         this.i();
      }
   }

   void N(int var1) {
      if (var1 >= this.B.size()) {
         this.u();
         this.i();
      } else {
         if (var1 > 0 && this.P) {
            class05531 class05531x = (class05531)this.B.get(var1 - 1);
            class05531x.y().forEach(var1x -> {
               class08610 class08610 = var1x.R();
               class05514.N(class08610.u(), this.y);
               this.y.N(class08610.d(), false);
            });
         }

         class05531 class05531 = (class05531)this.B.get(var1);
         this.W.N(this.y);
         this.m.N(this.y);
         Collection<class05513> collection = this.N(class05531.y());
         i.info("Running test environment '{}' batch {} ({} tests)...", new Object[]{class05531.L().M(), class05531.N(), collection.size()});
         this.u();
         this.E = class05531.L();
         this.E.N().N(this.y);
         this.L.forEach(var1x -> var1x.N(class05531));
         class05494 class05494 = new class05494();
         collection.forEach(class05494::N);
         class05494.N(new class05508(this, class05494, class05531, var1));
         collection.forEach(this.R::N);
      }
   }

   public void N(class04251 var1) {
      this.L.add(var1);
   }

   public List<class05513> N() {
      return this.M;
   }
}
