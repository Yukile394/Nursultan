package minecraft;

import baritone.utils.accessor.IChunkArray;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jerozgen.languagereload.mixin.ClientChunkMapAccessor;
import org.jspecify.annotations.Nullable;

public class class01705 implements IChunkArray, ClientChunkMapAccessor {
   final AtomicReferenceArray<class00570> N;
   final LongOpenHashSet y;
   final int L;
   private final int B;
   volatile int u;
   volatile int i;
   int R;

   private void L(class00570 var1) {
      class00554[] aclass00554 = var1.u();

      for (int ix = 0; ix < aclass00554.length; ix++) {
         if (aclass00554[ix].L()) {
            class07321 class07321 = var1.R();
            this.y.add(class01296.y(class07321.B, var1.method_31604(ix), class07321.Z));
         }
      }
   }

   class01705(class01688 var1, int var2) {
      super();
      this.M = var1;
      this.y = new LongOpenHashSet();
      this.L = var2;
      this.B = var2 * 2 + 1;
      this.N = new AtomicReferenceArray<>(this.B * this.B);
   }

   public boolean y(int var1, int var2) {
      return Math.abs(var1 - this.u) <= this.L && Math.abs(var2 - this.i) <= this.L;
   }

   private void y(class00570 var1) {
      class00554[] aclass00554 = var1.u();

      for (int ix = 0; ix < aclass00554.length; ix++) {
         class07321 class07321 = var1.R();
         this.y.remove(class01296.y(class07321.B, var1.method_31604(ix), class07321.Z));
      }
   }

   void y(int var1, class00570 var2) {
      if (this.N.compareAndSet(var1, var2, null)) {
         this.R--;
         this.y(var2);
      }

      this.M.L.N(var2);
   }

   int N(int var1, int var2) {
      return Math.floorMod(var2, this.B) * this.B + Math.floorMod(var1, this.B);
   }

   @Nullable
   protected class00570 N(int var1) {
      return this.N.get(var1);
   }

   private void N(String var1) {
      try (FileOutputStream fileoutputstream = new FileOutputStream(var1)) {
         int ix = this.M.y.L;

         for (int j = this.i - ix; j <= this.i + ix; j++) {
            for (int k = this.u - ix; k <= this.u + ix; k++) {
               class00570 class00570 = this.M.y.N.get(this.M.y.N(k, j));
               if (class00570 != null) {
                  class07321 class07321 = class00570.R();
                  fileoutputstream.write((class07321.B + "\t" + class07321.Z + "\t" + class00570.O() + "\n").getBytes(StandardCharsets.UTF_8));
               }
            }
         }
      } catch (IOException ioexception) {
         class01688.N.error("Failed to dump chunks to file {}", var1, ioexception);
      }
   }

   public void N(int var1, int var2, int var3, boolean var4) {
      if (this.y(var1, var3)) {
         long ix = class01296.y(var1, var2, var3);
         if (var4) {
            this.y.add(ix);
         } else if (this.y.remove(ix)) {
            this.M.L.N(ix);
         }
      }
   }

   void N(int var1, @Nullable class00570 var2) {
      class00570 class00570 = this.N.getAndSet(var1, var2);
      if (class00570 != null) {
         this.R--;
         this.y(class00570);
         this.M.L.N(class00570);
      }

      if (var2 != null) {
         this.R++;
         this.L(var2);
      }
   }

   void N(class00570 var1) {
      class07321 class07321 = var1.R();
      class00554[] aclass00554 = var1.u();

      for (int ix = 0; ix < aclass00554.length; ix++) {
         class00554 class00554 = aclass00554[ix];
         long j = class01296.y(class07321.B, var1.method_31604(ix), class07321.Z);
         if (class00554.L()) {
            this.y.add(j);
         } else if (this.y.remove(j)) {
            this.M.L.N(j);
         }
      }
   }

   public void copyFrom(IChunkArray var1) {
      this.u = var1.centerX();
      this.i = var1.centerZ();
      AtomicReferenceArray<class00570> atomicreferencearray = var1.getChunks();

      for (int ix = 0; ix < atomicreferencearray.length(); ix++) {
         class00570 class00570 = atomicreferencearray.get(ix);
         if (class00570 != null) {
            class07321 class07321 = class00570.R();
            if (this.y(class07321.B, class07321.Z)) {
               int j = this.N(class07321.B, class07321.Z);
               if (this.N.get(j) != null) {
                  throw new IllegalStateException("Doing this would mutate the client's REAL loaded chunks?!");
               }

               this.N(j, class00570);
            }
         }
      }
   }

   public int centerZ() {
      return this.i;
   }

   public int centerX() {
      return this.u;
   }

   public AtomicReferenceArray getChunks() {
      return this.N;
   }

   public int viewDistance() {
      return this.L;
   }
}
