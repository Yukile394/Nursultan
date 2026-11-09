package minecraft;

import com.mojang.logging.LogUtils;
import java.util.EnumSet;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Generate;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.LevelTypeChange;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Load;
import net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02696 {
   private static final Logger N = LogUtils.getLogger();
   private static final class04763[] y = class04763.values();

   static CompletableFuture<class08050> L(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      var0.N().method_39778(var3);
      return CompletableFuture.completedFuture(var3);
   }

   static CompletableFuture<class08050> M(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class04782 class04782 = var0.N();
      class01607 class01607 = new class01607(class04782, var2, var1, var3);
      var0.y().N(class01607, class04782.method_27056().N(class01607), class04782.method_14178().W(), var3);
      return CompletableFuture.completedFuture(var3);
   }

   public class02696() {
      super();
   }

   static CompletableFuture<class08050> B(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class04782 class04782 = var0.N();
      class01607 class01607 = new class01607(class04782, var2, var1, var3);
      if (var3 instanceof class07361 class07361) {
         class03001.N_37(class01607, class07361);
      }

      var0.y().N(class01607, class04782.method_8412(), class04782.method_14178().W(), class04782.method_22385(), class04782.method_27056().N(class01607), var3);
      return CompletableFuture.completedFuture(var3);
   }

   static CompletableFuture<class08050> Z(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class04782 class04782 = var0.N();
      class07841.N(var3, EnumSet.of(class07830.field_13197, class07830.field_13203, class07830.field_13200, class07830.field_13202));
      class01607 class01607 = new class01607(class04782, var2, var1, var3);
      if (!class07529.NO) {
         var0.y().N(class01607, var3, class04782.method_27056().N(class01607));
      }

      class03001.N(class01607, var3);
      return CompletableFuture.completedFuture(var3);
   }

   static CompletableFuture<class08050> i(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class04782 class04782 = var0.N();
      class01607 class01607 = new class01607(class04782, var2, var1, var3);
      return var0.y().N(class04782.method_14178().W(), class03001.N(class01607), class04782.method_27056().N(class01607), var3);
   }

   static CompletableFuture<class08050> U(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      boolean flag = N(var3);
      return var0.u().y(var3, flag);
   }

   static CompletableFuture<class08050> z(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class04775 class04775 = var0.u();
      var3.k();
      ((class07361)var3).N(class04775);
      boolean flag = N(var3);
      return class04775.N(var3, flag);
   }

   static CompletableFuture<class08050> u(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class04782 class04782 = var0.N();
      class01607 class01607 = new class01607(class04782, var2, var1, var3);
      var0.y().N(class01607, class04782.method_27056().N(class01607), var3);
      return CompletableFuture.completedFuture(var3);
   }

   static CompletableFuture<class08050> y(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class04782 class04782 = var0.N();
      if (class04782.method_8503().yn().l().u()) {
         var0.y().N(class04782.method_30349(), class04782.method_14178().E(), class04782.method_27056(), var3, var0.L(), class04782.method_27983());
      }

      class04782.method_39778(var3);
      return CompletableFuture.completedFuture(var3);
   }

   static CompletableFuture<class08050> E(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      if (!var3.d()) {
         var0.y().N(new class01607(var0.N(), var2, var1, var3));
      }

      return CompletableFuture.completedFuture(var3);
   }

   private static boolean N(class08050 var0) {
      return var0.E().N(class00549.E) && var0.t();
   }

   private static void N(class08050 var0, class02688 var1, class02236 var2, CallbackInfoReturnable var3) {
      class00570 class00570 = (class00570)var3.getReturnValue();
      ((Load)ServerChunkEvents.CHUNK_LOAD.invoker()).onChunkLoad(var1.N(), class00570);
      if (!(var0 instanceof class00548)) {
         ((Generate)ServerChunkEvents.CHUNK_GENERATE.invoker()).onChunkGenerate(var1.N(), class00570);
      }

      ChunkLevelTypeEventTracker chunkleveltypeeventtracker = (ChunkLevelTypeEventTracker)var2;

      for (int i = chunkleveltypeeventtracker.fabric_getCurrentEventLevelType().ordinal(); i < var2.j().ordinal(); i++) {
         class04763 class04763x = y[i];
         class04763 class04763x = y[i + 1];
         ((LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker()).onChunkLevelTypeChange(var1.N(), class00570, class04763x, class04763x);
         chunkleveltypeeventtracker.fabric_setCurrentEventLevelType(class04763x);
      }
   }

   static CompletableFuture<class08050> N(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      return CompletableFuture.completedFuture(var3);
   }

   private static void N(class04782 var0, class08319 var1) {
      if (!var1.N()) {
         var0.method_31426(class07078.N(var1, var0, class06113.field_52444));
      }
   }

   static CompletableFuture<class08050> W(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class07321 class07321 = var3.R();
      class02236 class02236 = (class02236)var2.N(class07321.B, class07321.Z);
      return CompletableFuture.supplyAsync(() -> {
         class07361 class07361 = (class07361)var3;
         class04782 class04782 = var0.N();
         class00570 class00570;
         if (class07361 instanceof class00548) {
            class00570 = ((class00548)class07361).I();
         } else {
            class00570 = new class00570(class04782, class07361, var3x -> {
               try (class04495 class04495 = new class04495(var3.Q(), N)) {
                  N(class04782, class08308.N(class04495, class04782.method_30349(), class07361.o()));
               }
            });
            class02236.N(new class00548(class00570, false));
         }

         class00570.y(class02236::j);
         class00570.I();
         class00570.y(true);
         class00570.K();
         class00570.y(class04782);
         class00570.N(var0.R());
         N(var3, var0, class02236, new CallbackInfoReturnable("", false, class00570));
         return class00570;
      }, var0.i());
   }

   static CompletableFuture<class08050> R(class02688 var0, class02237 var1, class02248<class02236> var2, class08050 var3) {
      class04782 class04782 = var0.N();
      class01607 class01607 = new class01607(class04782, var2, var1, var3);
      return var0.y().N(class03001.N(class01607), class04782.method_14178().W(), class04782.method_27056().N(class01607), var3).thenApply(var0x -> {
         if (var0x instanceof class07361 class07361) {
            class02999 class02999 = class07361.l();
            if (class02999 != null) {
               class02999.N(class07361);
               if (class02999.y()) {
                  class02999.y(class07361);
               }
            }
         }

         return (class08050)var0x;
      });
   }
}
