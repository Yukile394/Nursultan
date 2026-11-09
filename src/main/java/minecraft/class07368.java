package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import org.jspecify.annotations.Nullable;

public final class class07368 implements AutoCloseable {
   public static final String N = ".mca";
   private static final int y = 256;
   private final Long2ObjectLinkedOpenHashMap<class07357> L = new Long2ObjectLinkedOpenHashMap();
   private final class02277 u;
   private final Path i;
   private final boolean R;

   class07368(class02277 var1, Path var2, boolean var3) {
      super();
      this.i = var2;
      this.R = var3;
      this.u = var1;
   }

   @Override
   public void close() throws IOException {
      class05290 class05290 = new class05290();
      ObjectIterator<class07357> objectiterator = this.L.values().iterator();

      while (objectiterator.hasNext()) {
         class07357 class07357 = (class07357)objectiterator.next();

         try {
            class07357.close();
         } catch (IOException ioexception) {
            class05290.N(ioexception);
         }
      }

      class05290.N();
   }

   public class02277 y() {
      return this.u;
   }

   private class07357 y(class07321 var1) throws IOException {
      long ix = class07321.u(var1.Z(), var1.z());
      class07357 class07357x = (class07357)this.L.getAndMoveToFirst(ix);
      if (class07357x != null) {
         return class07357x;
      } else {
         if (this.L.size() >= 256) {
            ((class07357)this.L.removeLast()).close();
         }

         class06290.L(this.i);
         Path path = this.i.resolve("r." + var1.Z() + "." + var1.z() + ".mca");
         class07357 class07357x = new class07357(this.u, path, this.i, this.R);
         this.L.putAndMoveToFirst(ix, class07357x);
         return class07357x;
      }
   }

   protected void N(class07321 var1, @Nullable class07001 var2) throws IOException {
      if (!class07529.D) {
         class07357 class07357 = this.y(var1);
         if (var2 == null) {
            class07357.u(var1);
         } else {
            try (DataOutputStream dataoutputstream = class07357.L(var1)) {
               class07742.N(var2, (DataOutput)dataoutputstream);
            }
         }
      }
   }

   public void N() throws IOException {
      ObjectIterator<class07357> objectiterator = this.L.values().iterator();

      while (objectiterator.hasNext()) {
         ((class07357)objectiterator.next()).y();
      }
   }

   public void N(class07321 var1, class03175 var2) throws IOException {
      try (DataInputStream datainputstream = this.y(var1).N(var1)) {
         if (datainputstream != null) {
            class07742.N_81(datainputstream, var2, class07726.L());
         }
      }
   }

   @Nullable
   public class07001 N(class07321 var1) throws IOException {
      class07001 class07001;
      try (DataInputStream datainputstream = this.y(var1).N(var1)) {
         if (datainputstream == null) {
            return null;
         }

         class07001 = class07742.N(datainputstream);
      }

      return class07001;
   }
}
