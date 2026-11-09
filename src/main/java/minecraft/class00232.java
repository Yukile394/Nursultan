package minecraft;

import Nursultan.class09427;
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00232 implements AutoCloseable {
   private static final class00392 i = class00392.L("resourcePack.server.name");
   private static final Pattern R = Pattern.compile("^[a-fA-F0-9]{40}$");
   static final Logger N = LogUtils.getLogger();
   private static final class01057 M = var0 -> {};
   private static final class02268 B = new class02268(true, class01090.field_14280, true);
   private static final class03802 Z = new class00224();
   final class06202 y;
   private class01057 z = M;
   @Nullable
   private class03805 U;
   final class03837 L;
   private final class01789 E;
   private class01283 W = class01283.R;
   class03802 u = Z;
   private int m;

   public void L() {
      if (this.U != null) {
         this.U.N(true);
         this.U = null;
         this.z = M;
      }
   }

   public void M() {
      this.L.L();
   }

   public class00232(class06202 var1, Path var2, class09427 var3) {
      super();
      this.y = var1;

      try {
         this.E = new class01789(var2);
      } catch (IOException ioexception) {
         throw new UncheckedIOException("Failed to open download queue in directory " + var2, ioexception);
      }

      Executor executor = var1::N;
      this.L = new class03837(this.N(this.E, executor, var3.N, var3.y), new class00230(this), this.z(), this.N(executor), class03826.field_47647);
   }

   public void B() {
      this.L.u();
   }

   public void Z() {
      this.L.y();
      this.u = Z;
      this.L.i();
   }

   public void i() {
      this.L.y();
   }

   @Override
   public void close() throws IOException {
      this.E.close();
   }

   private class03820 z() {
      return this::N;
   }

   public void u() {
      if (this.U != null) {
         this.U.N();
         this.U = null;
      }
   }

   public CompletableFuture<Void> y(UUID var1) {
      CompletableFuture completablefuture = new CompletableFuture();
      class03802 class03802 = this.u;
      this.u = new class00221(this, class03802, var1, completablefuture);
      return completablefuture;
   }

   private static class01057 y(List<class01055> var0) {
      return var0.isEmpty() ? M : var0::forEach;
   }

   public void y() {
      if (this.U != null) {
         this.U.N(false);
         List list = this.N(this.U.y());
         if (list == null) {
            N.warn("Double failure in loading server packs");
            list = List.of();
         }

         this.z = y(list);
      }
   }

   class05007 N(int var1) {
      return new class00192(this, var1);
   }

   public class01057 N() {
      return var1 -> this.z.method_14453(var1);
   }

   @Nullable
   private List<class01055> N(List<class03821> var1) {
      ArrayList arraylist = new ArrayList(var1.size());

      for (class03821 class03821 : Lists.reverse(var1)) {
         String s = String.format(Locale.ROOT, "server/%08X/%s", this.m++, class03821.N());
         Path path = class03821.y();
         class02267 class02267 = new class02267(s, i, this.W, Optional.empty());
         class01613 class01613 = new class01613(path);
         class08735 class08735 = class07529.y().method_70592(class01603.field_14188);
         class01078 class01078 = class01055.N(class02267, class01613, class08735, class01603.field_14188);
         if (class01078 == null) {
            N.warn("Invalid pack metadata in {}, ignoring all", path);
            return null;
         }

         arraylist.add(new class01055(class02267, class01613, class01078, B));
      }

      return arraylist;
   }

   public void N(UUID var1, Path var2) {
      this.L.N(var1, var2);
   }

   private Runnable N(Executor var1) {
      return new class00214(this, var1);
   }

   private class03813 N(class01789 var1, Executor var2, class04771 var3, Proxy var4) {
      return new class00222(this, var3, var1, var4, var2);
   }

   public void N(UUID var1, URL var2, @Nullable String var3) {
      HashCode hashcode = N(var3);
      this.L.N(var1, var2, hashcode);
   }

   @Nullable
   private static HashCode N(@Nullable String var0) {
      return var0 != null && R.matcher(var0).matches() ? HashCode.fromString(var0.toLowerCase(Locale.ROOT)) : null;
   }

   public void N(UUID var1) {
      this.L.N(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void N(class00642 var1, class03826 var2) {
      this.W = class01283.R;
      this.u = N(var1);
      switch (var2) {
         case field_47648:
            this.L.L();
            break;
         case field_47649:
            this.L.u();
            break;
         case field_47647:
            this.L.i();
      }
   }

   private static class03802 N(class00642 var0) {
      return new class00233(var0);
   }

   private void N(class03805 var1) {
      this.U = var1;
      List list = var1.y();
      List list1 = this.N(list);
      if (list1 == null) {
         var1.N(false);
         List list2 = var1.y();
         list1 = this.N(list2);
         if (list1 == null) {
            N.warn("Double failure in loading server packs");
            list1 = List.of();
         }
      }

      this.z = y(list1);
      this.y.yy();
   }

   public void R() {
      this.W = class01283.i;
      this.u = Z;
      this.L.L();
   }
}
