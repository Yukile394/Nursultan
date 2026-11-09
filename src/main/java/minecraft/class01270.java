package minecraft;

import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01270 extends class05096 {
   static final Logger N = LogUtils.getLogger();
   private static final class00392 y = class00392.L("pack.available.title");
   private static final class00392 L = class00392.L("pack.selected.title");
   private static final class00392 u = class00392.L("pack.openFolder");
   private static final class00392 i = class00392.L("gui.packSelection.search").L(class04927.field_62466);
   private static final int R = 200;
   private static final int M = 4;
   private static final int B = 15;
   private static final class00392 Z = class00392.L("pack.dropInfo").N(class06541.field_1080);
   private static final class00392 z = class00392.L("pack.folderInfo");
   private static final int U = 20;
   private static final class01894 E = class01894.y("textures/misc/unknown_pack.png");
   private final class03686 W = new class03686(this);
   private final class01257 m;
   @Nullable
   private class01273 P;
   private long s;
   @Nullable
   private class05059 T;
   @Nullable
   private class05059 b;
   @Nullable
   private class04927 j;
   private final Path v;
   @Nullable
   private class05362 n;
   private final Map<String, class01894> t = Maps.newHashMap();

   public class01270(class01623 var1, Consumer<class01623> var2, Path var3, class00392 var4) {
      super(var4);
      this.m = new class01257(this::N, this::N, var1, var2);
      this.v = var3;
      this.P = class01273.N(var3);
   }

   private void y() {
      this.m.i();
      this.N(null);
      this.s = 0L;
      this.t.clear();
   }

   private static Stream<String> N(Collection<Path> var0) {
      return var0.stream().map(Path::getFileName).map(Path::toString);
   }

   private class01894 N(class08627 var1, class01055 var2) {
      try {
         class01894 class01894;
         try (class01622 class01622 = var2.R()) {
            class03652<InputStream> class03652 = class01622.method_14410("pack.png");
            if (class03652 == null) {
               return E;
            }

            String sx = var2.M();
            class01894 class01894x = class01894.y("pack/" + class07536.N_75(sx, class01894::y) + "/" + Hashing.sha1().hashUnencodedChars(sx) + "/icon");

            try (InputStream inputstream = class03652.get()) {
               class08280 class08280 = class08280.N(inputstream);
               var1.N(class01894x, new class08829(class01894x::toString, class08280));
               class01894 = class01894x;
            }
         }

         return class01894;
      } catch (Exception exception) {
         N.warn("Failed to load icon from pack {}", var2.M(), exception);
         return E;
      }
   }

   private void N(String var1, Stream<class01272> var2, @Nullable class05059 var3) {
      if (var3 != null) {
         String sx = var1.toLowerCase(Locale.ROOT);
         Stream stream = var2.filter(
            var2x -> var1.isBlank()
               || var2x.L().toLowerCase(Locale.ROOT).contains(sx)
               || var2x.u().getString().toLowerCase(Locale.ROOT).contains(sx)
               || var2x.i().getString().toLowerCase(Locale.ROOT).contains(sx)
         );
         var3.N(stream, null);
      }
   }

   private void N(class01250 var1) {
      if (this.b != null) {
         this.b.N(this.m.y(), var1);
      }

      if (this.T != null) {
         this.T.N(this.m.N(), var1);
      }

      if (this.j != null) {
         this.N(this.j.method_1882());
      }

      if (this.n != null) {
         this.n.field_22763 = !this.b.method_25396().isEmpty();
      }
   }

   private void N(String var1) {
      this.N(var1, this.m.y(), this.b);
      this.N(var1, this.m.N(), this.T);
   }

   private void N() {
      if (this.P != null) {
         try {
            this.P.close();
            this.P = null;
         } catch (Exception exception) {
         }
      }
   }

   private class01894 N(class01055 var1) {
      return this.t.computeIfAbsent(var1.M(), var2 -> this.N(this.field_22787.NO(), var1));
   }

   protected static void N(class06202 var0, List<Path> var1, Path var2) {
      MutableBoolean mutableboolean = new MutableBoolean();
      var1.forEach(var2x -> {
         try (Stream<Path> stream = Files.walk(var2x)) {
            stream.forEach(var3x -> {
               try {
                  class07536.y(var2x.getParent(), var2, var3x);
               } catch (IOException ioexceptionx) {
                  N.warn("Failed to copy datapack file  from {} to {}", new Object[]{var3x, var2, ioexceptionx});
                  mutableboolean.setTrue();
               }
            });
         } catch (IOException ioexception) {
            N.warn("Failed to copy datapack file from {} to {}", var2x, var2);
            mutableboolean.setTrue();
         }
      });
      if (mutableboolean.isTrue()) {
         class06132.L(var0, var2.toString());
      }
   }

   @Override
   public void method_25426() {
      this.W.y(4 + 9 + 4 + 9 + 4 + 15 + 4);
      class01885 class01885x = this.W.N(class01885.u().N(4));
      class01885x.L().y();
      class01885x.N(new class02071(this.method_25440(), this.field_22793));
      class01885x.N(new class02071(Z, this.field_22793));
      this.j = class01885x.N(new class04927(this.field_22793, 0, 0, 200, 15, class00392.i()));
      this.j.method_47404(i);
      this.j.method_1863(this::N);
      this.T = this.W.L(new class05059(this.field_22787, this, 200, this.field_22790 - 66, y));
      this.b = this.W.L(new class05059(this.field_22787, this, 200, this.field_22790 - 66, L));
      class01885 class01885x = this.W.y(class01885.i().N(8));
      class01885x.N(class05362.method_46430(u, var1x -> class07536.m().N(this.v)).N(class04141.N(z)).N());
      this.n = class01885x.N(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N());
      this.W.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
      this.y();
   }

   @Override
   protected void method_56131() {
      if (this.j != null) {
         this.method_48265(this.j);
      } else {
         super.method_56131();
      }
   }

   @Override
   public void method_48640() {
      this.W.N();
      if (this.T != null) {
         this.T.method_73369(200, this.W.u(), this.field_22789 / 2 - 15 - 200, this.W.L());
      }

      if (this.b != null) {
         this.b.method_73369(200, this.W.u(), this.field_22789 / 2 + 15, this.W.L());
      }
   }

   @Override
   public void method_25393() {
      if (this.P != null) {
         try {
            if (this.P.N()) {
               this.s = 20L;
            }
         } catch (IOException ioexception) {
            N.warn("Failed to poll for directory {} changes, stopping", this.v);
            this.N();
         }
      }

      if (this.s > 0L && --this.s == 0L) {
         this.y();
      }
   }

   @Override
   public void method_25419() {
      this.m.u();
      this.N();
   }

   @Override
   public void method_29638(List<Path> var1) {
      String sx = N(var1).collect(Collectors.joining(", "));
      this.field_22787
         .N(
            new class05733(
               var2x -> {
                  if (var2x) {
                     ArrayList arraylist = new ArrayList(var1.size());
                     HashSet hashset = new HashSet(var1);
                     class01280 class01280 = new class01280(this, this.field_22787.Ni());
                     ArrayList arraylist1 = new ArrayList();

                     for (Path path : var1) {
                        try {
                           Path path1 = (Path)class01280.N(path, arraylist1);
                           if (path1 == null) {
                              N.warn("Path {} does not seem like pack", path);
                           } else {
                              arraylist.add(path1);
                              hashset.remove(path1);
                           }
                        } catch (IOException ioexception) {
                           N.warn("Failed to check {} for packs", path, ioexception);
                        }
                     }

                     if (!arraylist1.isEmpty()) {
                        this.field_22787.N(class01864.y(() -> this.field_22787.N(this)));
                        return;
                     }

                     if (!arraylist.isEmpty()) {
                        N(this.field_22787, arraylist, this.v);
                        this.y();
                     }

                     if (!hashset.isEmpty()) {
                        String sxx = N(hashset).collect(Collectors.joining(", "));
                        this.field_22787
                           .N(
                              new class01304(
                                 () -> this.field_22787.N(this), class00392.L("pack.dropRejected.title"), class00392.N("pack.dropRejected.message", sxx)
                              )
                           );
                        return;
                     }
                  }

                  this.field_22787.N(this);
               },
               class00392.L("pack.dropConfirm"),
               class00392.y(sx)
            )
         );
   }
}
