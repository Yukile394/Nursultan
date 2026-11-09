package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.slf4j.Logger;

public class class01910 {
   private static final Logger N = LogUtils.getLogger();
   private static final UUID y = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final class06202 L;
   private final class04777 u;

   public class01910(class06202 var1, class04777 var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   private void y(class04785 var1, class03531 var2, class01623 var3, Runnable var4) {
      class00232 class00232 = this.L.yL();
      this.N(class00232, var1).thenApply(var0 -> true).exceptionallyComposeAsync(var1x -> {
         N.warn("Failed to load pack: ", var1x);
         return this.N();
      }, this.L).thenAcceptAsync(var6 -> {
         if (var6) {
            this.N(var1, var2, class00232, var3, var4);
         } else {
            class00232.i();
            var2.close();
            var1.L();
            var4.run();
         }
      }, this.L).exceptionally(var1x -> {
         this.L.u(class07080.N(var1x, "Load world"));
         return null;
      });
   }

   private class04785 N(String var1) {
      try {
         return this.u.u(var1);
      } catch (IOException ioexception) {
         N.warn("Failed to read level {} data", var1, ioexception);
         class06132.N(this.L, var1);
         this.L.N(null);
         return null;
      } catch (class04151 class04151) {
         N.warn("{}", class04151.getMessage());
         this.L.N(class01864.N(() -> this.L.N(null)));
         return null;
      }
   }

   public void N(String var1, class07312 var2, class05934 var3, Function<class01929, class03764> var4, class05096 var5) {
      this.L.y(new class06307(class00392.L("selectWorld.data_read")));
      class04785 class04785 = this.N(var1);
      if (class04785 != null) {
         class01623 class01623 = class01093.N(class04785);
         class03776 class03776 = var2.M();

         try {
            class01898 class01898 = new class01898(class01623, class03776, false, false);
            class03531 class03531 = this.N(class01898, var3x -> {
               class03781 class03781 = ((class03764)var4.apply(var3x.L())).N(var3x.u().L(class04227.yI));
               return new class03981<>(new class06207(var2, var3, class03781.u(), class03781.N()), class03781.y());
            }, class03531::new);
            this.L.N(class04785, class01623, class03531, true);
         } catch (Exception exception) {
            N.warn("Failed to load datapacks, can't proceed with server load", exception);
            class04785.L();
            this.L.N(var5);
         }
      }
   }

   public static void N(class06202 var0, class05213 var1, Lifecycle var2, Runnable var3, boolean var4) {
      BooleanConsumer booleanconsumer = var3x -> {
         if (var3x) {
            var3.run();
         } else {
            var0.N(var1);
         }
      };
      if (var4 || var2 == Lifecycle.stable()) {
         var3.run();
      } else if (var2 == Lifecycle.experimental()) {
         var0.N(
            new class05733(booleanconsumer, class00392.L("selectWorld.warning.experimental.title"), class00392.L("selectWorld.warning.experimental.question"))
         );
      } else {
         var0.N(new class05733(booleanconsumer, class00392.L("selectWorld.warning.deprecated.title"), class00392.L("selectWorld.warning.deprecated.question")));
      }
   }

   public void N(String var1, Runnable var2) {
      this.L.y(new class06307(class00392.L("selectWorld.data_read")));
      class04785 class04785 = this.N(var1);
      if (class04785 != null) {
         this.N(class04785, var2);
      }
   }

   private void N(class04785 var1, Runnable var2) {
      this.L.y(new class06307(class00392.L("selectWorld.data_read")));

      Dynamic<?> dynamic;
      class06434 class06434;
      try {
         dynamic = var1.B();
         class06434 = var1.N(dynamic);
      } catch (class03142 | class03103 | IOException ioexception) {
         this.L.N(new class03117(this.L, var3x -> {
            if (var3x) {
               this.N(var1, var2);
            } else {
               var1.L();
               var2.run();
            }
         }, var1));
         return;
      } catch (OutOfMemoryError outofmemoryerror1) {
         class04583.y();
         String s = "Ran out of memory trying to read level data of world folder \"" + var1.R() + "\"";
         N.error(LogUtils.FATAL_MARKER, s);
         OutOfMemoryError outofmemoryerror = new OutOfMemoryError("Ran out of memory reading level data");
         outofmemoryerror.initCause(outofmemoryerror1);
         class07080 class07080 = class07080.N(outofmemoryerror, s);
         class07080.N("World details").N("World folder", var1.R());
         throw new class07878(class07080);
      }

      this.N(var1, class06434, dynamic, var2);
   }

   private void N(class04785 var1, class06434 var2, Dynamic<?> var3, Runnable var4) {
      if (!var2.b()) {
         var1.L();
         this.L
            .N(new class01304(var4, class00392.L("selectWorld.incompatible.title").y(-65536), class00392.N("selectWorld.incompatible.description", var2.U())));
      } else {
         class06449 class06449 = var2.P();
         if (class06449.N()) {
            String s = "selectWorld.backupQuestion." + class06449.L();
            String s1 = "selectWorld.backupWarning." + class06449.L();
            class05216 class05216x = class00392.L(s);
            if (class06449.y()) {
               class05216x.y(-2142128);
            }

            class05216 class05216x = class00392.N(s1, var2.U(), class07529.y().comp_4025());
            this.L.N(new class01292(() -> {
               var1.L();
               var4.run();
            }, (var4x, var5x) -> {
               if (var4x) {
                  class05227.N(var1);
               }

               this.N(var1, var3, false, var4);
            }, class05216x, class05216x, false));
         } else {
            this.N(var1, var3, false, var4);
         }
      }
   }

   private void N(class04785 var1, Dynamic<?> var2, boolean var3, Runnable var4) {
      this.L.y(new class06307(class00392.L("selectWorld.resource_load")));
      class01623 class01623 = class01093.N(var1);

      class03531 class03531;
      try {
         class03531 = this.N(var2, var3, class01623);
         Iterator iterator = class03531.L().N().L(class04227.yI).iterator();

         while (iterator.hasNext()) {
            ((class01255)iterator.next()).y().N();
         }
      } catch (Exception exception) {
         N.warn("Failed to load level data or datapacks, can't proceed with server load", exception);
         if (!var3) {
            this.L.N(new class05969(() -> {
               var1.L();
               var4.run();
            }, () -> this.N(var1, var2, true, var4)));
         } else {
            var1.L();
            this.L
               .N(
                  new class01304(
                     var4,
                     class00392.L("datapackFailure.safeMode.failed.title"),
                     class00392.L("datapackFailure.safeMode.failed.description"),
                     class05220.U,
                     true
                  )
               );
         }

         return;
      }

      this.N(var1, class03531, class01623, var4);
   }

   public class03531 N(Dynamic<?> var1, boolean var2, class01623 var3) throws Exception {
      class01898 class01898 = class04777.N(var1, var3, var2);
      return this.N(class01898, var1x -> {
         class00751 class00751 = var1x.u().L(class04227.yI);
         class03101 class03101 = class04777.N(var1, var1x.y(), class00751, var1x.L());
         return new class03981<>(class03101.N(), class03101.y().y());
      }, class03531::new);
   }

   public Pair<class07312, class01896> N(class04785 var1) throws Exception {
      class01623 class01623 = class01093.N(var1);
      Dynamic<?> dynamic = var1.B();
      class01898 class01898 = class04777.N(dynamic, class01623, false);
      return this.N(class01898, var1x -> {
         class00751 class00751 = new class00731<>(class04227.yI, Lifecycle.stable()).W();
         class03101 class03101 = class04777.N(dynamic, var1x.y(), class00751, var1x.L());
         return new class03981<>(new class01899(class03101.N().q(), class03101.N().l(), class03101.y().L()), var1x.u());
      }, (var0, var1x, var2x, var3x) -> {
         var0.close();
         class08707 class08707 = new class08707(class03678.field_20624, class06826.N(), null);
         return Pair.of(var3x.N(), new class01896(var3x.y(), new class03764(var3x.L()), var2x, var1x, var3x.N().M(), class08707));
      });
   }

   private <D, R> R N(class01898 var1, class01933<D> var2, class01922<D, R> var3) throws Exception {
      CompletableFuture completablefuture = class01897.N(new class01908(var1, class07671.field_25421, class06984.L), var2, var3, class07536.B(), this.L);
      this.L.y(completablefuture::isDone);
      return (R)completablefuture.get();
   }

   private void N(class04785 var1, boolean var2, Runnable var3, Runnable var4) {
      class05216 class05216x;
      class05216 class05216x;
      if (var2) {
         class05216x = class00392.L("selectWorld.backupQuestion.customized");
         class05216x = class00392.L("selectWorld.backupWarning.customized");
      } else {
         class05216x = class00392.L("selectWorld.backupQuestion.experimental");
         class05216x = class00392.L("selectWorld.backupWarning.experimental");
      }

      this.L.N(new class01292(var4, (var2x, var3x) -> {
         if (var2x) {
            class05227.N(var1);
         }

         var3.run();
      }, class05216x, class05216x, false));
   }

   private CompletableFuture<Boolean> N() {
      CompletableFuture completablefuture = new CompletableFuture();
      this.L
         .N(
            new class05733(
               completablefuture::complete,
               class00392.L("multiplayer.texturePrompt.failure.line1"),
               class00392.L("multiplayer.texturePrompt.failure.line2"),
               class05220.Z,
               class05220.i
            )
         );
      return completablefuture;
   }

   public void N(class04785 var1, class01248 var2, class02003<class02969> var3, class05081 var4) {
      class01623 class01623 = class01093.N(var1);
      class03554 class03554 = (class03554)new class01898(class01623, var4.Q(), false, false).N().getSecond();
      this.L.N(var1, class01623, new class03531(class03554, var2, var3, var4), true);
   }

   private void N(class04785 var1, class03531 var2, class01623 var3, Runnable var4) {
      class05081 class05081 = var2.u();
      boolean flag = class05081.l().R();
      boolean flag1 = class05081.k() != Lifecycle.stable();
      if (!flag && !flag1) {
         this.y(var1, var2, var3, var4);
      } else {
         this.N(var1, flag, () -> this.y(var1, var2, var3, var4), () -> {
            var2.close();
            var1.L();
            var4.run();
         });
      }
   }

   private void N(class04785 var1, class03531 var2, class00232 var3, class01623 var4, Runnable var5) {
      if (var1.y()) {
         this.L
            .N(
               new class05733(
                  var6 -> {
                     if (var6) {
                        this.N(var1, var2, var4);
                     } else {
                        var3.i();
                        var2.close();
                        var1.L();
                        var5.run();
                     }
                  },
                  class00392.L("selectWorld.warning.lowDiskSpace.title").N(class06541.field_1061),
                  class00392.L("selectWorld.warning.lowDiskSpace.description"),
                  class05220.z,
                  class05220.U
               )
            );
      } else {
         this.N(var1, var2, var4);
      }
   }

   private void N(class04785 var1, class03531 var2, class01623 var3) {
      this.L.N(var1, var3, var2, false);
   }

   private CompletableFuture<Void> N(class00232 var1, class04785 var2) {
      Path path = var2.N(class05071.U);
      if (Files.exists(path) && !Files.isDirectory(path)) {
         var1.R();
         CompletableFuture<Void> completablefuture = var1.y(y);
         var1.N(y, path);
         return completablefuture;
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }
}
