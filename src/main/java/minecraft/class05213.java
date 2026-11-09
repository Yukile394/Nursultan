package minecraft;

import Nursultan.class10680;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class05213 extends class05096 {
   private static final int M = 1;
   private static final int B = 210;
   private static final Logger Z = LogUtils.getLogger();
   private static final String z = "mcworld-";
   static final class00392 N = class00392.L("selectWorld.gameMode");
   static final class00392 y = class00392.L("selectWorld.enterName");
   static final class00392 L = class00392.L("selectWorld.experiments");
   static final class00392 u = class00392.L("selectWorld.allowCommands.info");
   private static final class00392 U = class00392.L("createWorld.preparing");
   private static final int E = 10;
   private static final int W = 8;
   public static final class01894 i = class01894.y("textures/gui/tab_header_background.png");
   private final class03686 m = new class03686(this);
   final class03661 R;
   private final class03271 P = new class03271(var1x -> {
      class06478 class06478 = this.method_37063(var1x);
   }, var1x -> this.method_37066(var1x));
   private boolean s;
   private final class04173 T;
   private final class00247 b;
   private final Runnable j;
   @Nullable
   private Path v;
   @Nullable
   private class01623 n;
   @Nullable
   private class03281 t;

   @Nullable
   private Pair<Path, class01623> L(class03776 var1) {
      Path path = this.u();
      if (path != null) {
         if (this.n == null) {
            this.n = class01093.N(path, this.T);
            this.N(null);
            this.n.N();
         }

         this.n.y(var1.N().N());
         return Pair.of(path, this.n);
      } else {
         return null;
      }
   }

   private static class01623 L(class01623 var0) {
      var0.N.add(new ModResourcePackCreator(class01603.field_14190));
      return var0;
   }

   private void L() {
      class01896 class01896 = this.R.U();
      class03781 class03781 = class01896.i().N(class01896.u());
      class02003<class02969> class02003 = class01896.R().N(class02969.field_39973, class03781.y());
      Lifecycle lifecycle = class03794.N(class01896.B().y()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle lifecycle1 = class02003.N().u();
      Lifecycle lifecycle2 = lifecycle1.add(lifecycle);
      boolean flag = !this.s && lifecycle1 == Lifecycle.stable();
      class07312 class07312 = this.N(class03781.u() == class06228.field_40375);
      class06207 class06207 = new class06207(class07312, this.R.U().L(), class03781.u(), lifecycle2);
      class01910.N(this.field_22787, this, lifecycle2, () -> this.N(class02003, class06207), flag);
   }

   private class05213(class06202 var1, Runnable var2, class01896 var3, Optional<class05946<class04382>> var4, OptionalLong var5, class00247 var6) {
      super(class00392.L("selectWorld.create"));
      this.j = var2;
      this.T = var1.Ni();
      this.b = var6;
      this.R = new class03661(var1.NL().L(), var3, var4, var5);
   }

   private void i() {
      if (this.v != null && Files.exists(this.v)) {
         try (Stream<Path> stream = Files.walk(this.v)) {
            stream.sorted(Comparator.reverseOrder()).forEach(var0 -> {
               try {
                  Files.delete(var0);
               } catch (IOException ioexception1) {
                  Z.warn("Failed to remove temporary file {}", var0, ioexception1);
               }
            });
         } catch (IOException ioexception) {
            Z.warn("Failed to list temporary dir {}", this.v);
         }
      }

      this.v = null;
   }

   @Nullable
   private Path u() {
      if (this.v == null) {
         try {
            this.v = Files.createTempDirectory("mcworld-");
         } catch (IOException ioexception) {
            Z.warn("Failed to create temporary dir", ioexception);
            class06132.L(this.field_22787, this.R.L());
            this.y();
         }
      }

      return this.v;
   }

   void y(class03776 var1) {
      Pair<Path, class01623> pair = this.L(var1);
      if (pair != null) {
         this.field_22787
            .N(new class01270((class01623)pair.getSecond(), var1x -> this.N(var1x, true, this::y), (Path)pair.getFirst(), class00392.L("dataPack.title")));
      }
   }

   public void y() {
      this.j.run();
      this.i();
   }

   public static void y(class06202 var0, Runnable var1) {
      class08710 class08710 = (var0x, var1x, var2x) -> new class01896(
         var2x.N().N(),
         var2x.N().y(),
         var1x,
         var0x,
         var2x.y(),
         new class08707(class03678.field_20626, new class10680().N(class07305.N, false).N(class07305.y, false).N(class07305.S, false).N(), class04095.B)
      );
      Function function = var0x -> new class03796(class05934.y(), class05964.L(var0x.L()));
      N(var0, var1, function, class08710, class05964.y, (var0x, var1x, var2x, var3x) -> var0x.N(var1x, (class05081)var2x));
   }

   private void N(CallbackInfoReturnable var1) {
      this.n.N.add(new ModResourcePackCreator(class01603.field_14190));
   }

   private boolean N(class02003<class02969> var1, class05081 var2) {
      String sx = this.R.L();
      class01896 class01896 = this.R.U();
      N(this.field_22787, U);
      Optional<class04785> optional = N(this.field_22787, sx, this.v);
      if (optional.isEmpty()) {
         class06132.L(this.field_22787, sx);
         return false;
      } else {
         this.field_22787.S().N(optional.get(), class01896.M(), var1, var2);
         return true;
      }
   }

   private class07312 N(boolean var1) {
      String sx = this.R.y().trim();
      if (var1) {
         class07305 class07305 = new class07305(class03776.u.y());
         class07305.N(class07305.N, false, null);
         return new class07312(sx, class07282.field_9219, false, class07086.field_5801, true, class07305, class03776.u);
      } else {
         return new class07312(sx, this.R.u().field_20629, this.R.R(), this.R.i(), this.R.M(), this.R.T(), this.R.U().B());
      }
   }

   public static void N(class06202 var0, Runnable var1) {
      N(var0, var1, (var0x, var1x, var2, var3) -> var0x.N(var1x, (class05081)var2));
   }

   void N(class03776 var1) {
      Pair<Path, class01623> pair = this.L(var1);
      if (pair != null) {
         this.field_22787.N(new class01950(this, (class01623)pair.getSecond(), var1x -> this.N(var1x, false, this::N)));
      }
   }

   private void N(class01623 var1, boolean var2, Consumer<class03776> var3) {
      ImmutableList immutablelist = ImmutableList.copyOf(var1.i());
      List list = var1.L().stream().filter(var1x -> !immutablelist.contains(var1x)).collect(ImmutableList.toImmutableList());
      class03776 class03776 = new class03776(new class01247(immutablelist, list), this.R.U().B().y());
      if (this.R.N(class03776)) {
         this.field_22787.N(this);
      } else {
         if (class03794.N(var1.R()) && var2) {
            this.field_22787.N(new class03779(var1.M(), var4x -> {
               if (var4x) {
                  this.N(var1, class03776, var3);
               } else {
                  var3.accept(this.R.U().B());
               }
            }));
         } else {
            this.N(var1, class03776, var3);
         }
      }
   }

   private void N(class01623 var1, class03776 var2, Consumer<class03776> var3) {
      this.field_22787.y(new class06307(class00392.L("dataPack.validation.working")));
      class01897.<class03783, class01896>N(
            N(var1, var2),
            var1x -> {
               if (var1x.L().y(class04227.yO).z().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if (var1x.L().y(class04227.NA).z().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  class01896 class01896 = this.R.U();
                  DataResult dataresult = class03796.N(class01896.N().N(JsonOps.INSTANCE), class01896.L(), class01896.i()).setLifecycle(Lifecycle.stable());
                  class03519 class03519 = var1x.L().N(JsonOps.INSTANCE);
                  class03796 class03796 = (class03796)dataresult.flatMap(var1xx -> class03796.N.parse(class03519, var1xx))
                     .getOrThrow(var0 -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + var0));
                  return new class03981<>(new class03783(class03796, var1x.y()), var1x.u());
               }
            },
            (var0, var1x, var2x, var3x) -> {
               var0.close();
               return new class01896(var3x.N(), var2x, var1x, var3x.y());
            },
            class07536.B(),
            this.field_22787
         )
         .thenApply(var0 -> {
            var0.y();
            return (class01896)var0;
         })
         .thenAcceptAsync(this.R::N, this.field_22787)
         .handleAsync((var2x, var3x) -> {
            if (var3x != null) {
               Z.warn("Failed to validate datapack", var3x);
               this.field_22787.N(new class05733(var2xx -> {
                  if (var2xx) {
                     var3.accept(this.R.U().B());
                  } else {
                     var3.accept(class03776.u);
                  }
               }, class00392.L("dataPack.validation.failed"), class05220.N, class00392.L("dataPack.validation.back"), class00392.L("dataPack.validation.reset")));
            } else {
               this.field_22787.N(this);
            }

            return null;
         }, this.field_22787);
   }

   public static void N(class06202 var0, Runnable var1, class00247 var2) {
      class08710 class08710 = (var0x, var1x, var2x) -> new class01896(var2x.N(), var1x, var0x, var2x.y());
      Function function = var0x -> new class03796(class05934.N(), class05964.N(var0x.L()));
      N(var0, var1, function, class08710, class05964.N, var2);
   }

   private static void N(class06202 var0, Runnable var1, Function<class01930, class03796> var2, class08710 var3, class05946<class04382> var4, class00247 var5) {
      N(var0, U);
      class01623 class01623x = new class01623(new class01093(var0.Ni()));
      class03776 class03776 = class07529.ND ? new class03776(new class01247(List.of("vanilla", "tests"), List.of()), class03794.B) : R();
      class01623 class01623x = L(class01623x);
      CompletableFuture completablefuture = class01897.N(
         N(class01623x, class03776),
         var1x -> new class03981<>(new class03783((class03796)var2.apply(var1x), var1x.y()), var1x.u()),
         (var1x, var2x, var3x, var4x) -> {
            var1x.close();
            return var3.apply(var2x, var3x, var4x);
         },
         class07536.B(),
         var0
      );
      var0.y(completablefuture::isDone);
      var0.N(new class05213(var0, var1, (class01896)completablefuture.join(), Optional.of(var4), OptionalLong.empty(), var5));
   }

   public static class05213 N(class06202 var0, Runnable var1, class07312 var2, class01896 var3, @Nullable Path var4) {
      class05213 class05213 = new class05213(
         var0, var1, var3, class05964.N(var3.i()), OptionalLong.of(var3.L().L()), (var0x, var1x, var2x, var3x) -> var0x.N(var1x, (class05081)var2x)
      );
      class05213.s = true;
      class05213.R.N(var2.N());
      class05213.R.N(var2.i());
      class05213.R.N(var2.u());
      class05213.R.T().N(var2.R(), null);
      if (var2.L()) {
         class05213.R.N(class03678.field_20625);
      } else if (var2.y().M()) {
         class05213.R.N(class03678.field_20624);
      } else if (var2.y().R()) {
         class05213.R.N(class03678.field_20626);
      }

      class05213.v = var4;
      return class05213;
   }

   public class03661 N() {
      return this.R;
   }

   private static void N(class06202 var0, class00392 var1) {
      var0.y(new class06307(var1));
   }

   private void N(class02003<class02969> var1, class06207 var2) {
      boolean flag = this.b.create(this, var1, var2, this.v);
      this.i();
      if (!flag) {
         this.y();
      }
   }

   private static void N(Path var0, Path var1, Path var2) {
      try {
         class07536.y(var0, var1, var2);
      } catch (IOException ioexception) {
         Z.warn("Failed to copy datapack file from {} to {}", var2, var1);
         throw new UncheckedIOException(ioexception);
      }
   }

   @Nullable
   public static Path N(Path var0, class06202 var1) {
      MutableObject mutableobject = new MutableObject();

      try (Stream<Path> stream = Files.walk(var0)) {
         stream.filter(var1x -> !var1x.equals(var0)).forEach(var2x -> {
            Path path = (Path)mutableobject.get();
            if (path == null) {
               try {
                  path = Files.createTempDirectory("mcworld-");
               } catch (IOException ioexceptionx) {
                  Z.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(ioexceptionx);
               }

               mutableobject.setValue(path);
            }

            N(var0, path, var2x);
         });
      } catch (UncheckedIOException | IOException ioexception) {
         Z.warn("Failed to copy datapacks from world {}", var0, ioexception);
         class06132.L(var1, var0.toString());
         return null;
      }

      return (Path)mutableobject.get();
   }

   private static class01908 N(class01623 var0, class03776 var1) {
      class01898 class01898 = new class01898(var0, var1, false, true);
      return new class01908(class01898, class07671.field_25421, class06984.L);
   }

   private static Optional<class04785> N(class06202 var0, String var1, @Nullable Path var2) {
      try {
         class04785 class04785 = var0.NL().i(var1);
         if (var2 == null) {
            return Optional.of(class04785);
         }

         try {
            Optional optional;
            try (Stream<Path> stream = Files.walk(var2)) {
               Path path = class04785.N(class05071.z);
               class06290.L(path);
               stream.filter(var1x -> !var1x.equals(var2)).forEach(var2x -> N(var2, path, var2x));
               optional = Optional.of(class04785);
            }

            return optional;
         } catch (UncheckedIOException | IOException ioexception) {
            Z.warn("Failed to copy datapacks to world {}", var1, ioexception);
            class04785.close();
         }
      } catch (UncheckedIOException | IOException ioexception1) {
         Z.warn("Failed to create access for {}", var1, ioexception1);
      }

      return Optional.empty();
   }

   @Override
   public void method_25426() {
      this.t = class03281.method_48623(this.P, this.field_22789).N(new class05230(this), new class05208(this), new class05219(this)).N();
      this.method_37063(this.t);
      class01885 class01885 = this.m.y(class01885.i().N(8));
      class01885.N(class05362.method_46430(class00392.L("selectWorld.create"), var1x -> this.L()).N());
      class01885.N(class05362.method_46430(class05220.i, var1x -> this.y()).N());
      this.m.method_48206(var1x -> {
         var1x.method_48591(1);
         this.method_37063(var1x);
      });
      this.t.method_48987(0, false);
      this.R.N();
      this.method_48640();
   }

   @Override
   protected void method_56131() {
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.t.method_25404(var1)) {
         return true;
      } else if (super.method_25404(var1)) {
         return true;
      } else if (var1.u()) {
         this.L();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_48640() {
      if (this.t != null) {
         this.t.method_48618(this.field_22789);
         this.t.method_49613();
         int ix = this.t.method_48202().L();
         class03255 class03255 = new class03255(0, ix, this.field_22789, this.field_22790 - this.m.y() - ix);
         this.P.N(class03255);
         this.m.y(ix);
         this.m.N();
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(class08394.Na, class05096.field_49896, 0, this.field_22790 - this.m.y() - 2, 0.0F, 0.0F, this.field_22789, 2, 32, 2);
   }

   @Override
   public void method_25419() {
      this.y();
   }

   @Override
   protected void method_57735(class01054 var1) {
      var1.N(class08394.Na, i, 0, 0, 0.0F, 0.0F, this.field_22789, this.m.L(), 16, 16);
      this.method_57736(var1, 0, this.m.L(), this.field_22789, this.field_22790);
   }

   private static class03776 R() {
      return ModPackResourcesUtil.createDefaultDataConfiguration();
   }
}
