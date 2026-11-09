package minecraft;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.regex.Matcher;
import org.jspecify.annotations.Nullable;

public abstract class class06691 {
   private final class00392 u;
   private final class00392 i;
   private final String R;
   private final String M;
   @Nullable
   protected CompletableFuture<Void> N;
   protected final class05715 y;

   private static List<class06699> L(class02277 var0, Path var1) {
      File[] afile = var1.toFile().listFiles((var0x, var1x) -> var1x.endsWith(".mca"));
      if (afile == null) {
         return List.of();
      } else {
         ArrayList arraylist = Lists.newArrayList();

         for (File file1 : afile) {
            Matcher matcher = class06711.t.matcher(file1.getName());
            if (matcher.matches()) {
               int ix = Integer.parseInt(matcher.group(1)) << 5;
               int j = Integer.parseInt(matcher.group(2)) << 5;
               ArrayList arraylist1 = Lists.newArrayList();

               try (class07357 class07357 = new class07357(var0, file1.toPath(), var1, true)) {
                  for (int k = 0; k < 32; k++) {
                     for (int l = 0; l < 32; l++) {
                        class07321 class07321 = new class07321(k + ix, l + j);
                        if (class07357.y(class07321)) {
                           arraylist1.add(class07321);
                        }
                     }
                  }

                  if (!arraylist1.isEmpty()) {
                     arraylist.add(new class06699(class07357, arraylist1));
                  }
               } catch (Throwable throwable) {
                  class06711.N.error("Failed to read chunks from region file {}", file1.toPath(), throwable);
               }
            }
         }

         return arraylist;
      }
   }

   public class06691(class06711 var1, class05715 var2, String var3, String var4, class00392 var5, class00392 var6) {
      super();
      this.L = var1;
      this.y = var2;
      this.R = var3;
      this.M = var4;
      this.u = var5;
      this.i = var6;
   }

   private ListIterator<class06699> y(class02277 var1, Path var2) {
      List<class06699> list = L(var1, var2);
      this.L.T = this.L.T + list.size();
      this.L.s = this.L.s + list.stream().mapToInt(var0 -> var0.y().size()).sum();
      return list.listIterator();
   }

   private List<class06701> y() {
      ArrayList arraylist = Lists.newArrayList();

      for (class05946<class07299> class05946 : this.L.Z) {
         class02277 class02277 = new class02277(this.L.E.R(), class05946, this.R);
         Path path = this.L.E.N(class05946).resolve(this.M);
         class06172 class06172 = this.N(class02277, path);
         ListIterator<class06699> listiterator = this.y(class02277, path);
         arraylist.add(new class06701(class05946, class06172, listiterator));
      }

      return arraylist;
   }

   protected abstract boolean N(class06172 var1, class07321 var2, class05946<class07299> var3);

   private void N(class07357 var1) {
      if (this.L.U) {
         if (this.N != null) {
            this.N.join();
         }

         Path path = var1.N();
         Path path1 = class06711.N(path.getParent()).resolve(path.getFileName().toString());

         try {
            if (path1.toFile().exists()) {
               Files.delete(path);
               Files.move(path1, path);
            } else {
               class06711.N.error("Failed to replace an old region file. New file {} does not exist.", path1);
            }
         } catch (IOException ioexception) {
            class06711.N.error("Failed to replace an old region file", ioexception);
         }
      }
   }

   private boolean N(class05946<class07299> var1, class06172 var2, class07321 var3) {
      boolean flag = false;

      try {
         flag = this.N(var2, var3, var1);
      } catch (CompletionException | class07878 class07878) {
         Throwable throwable = class07878.getCause();
         if (!(throwable instanceof IOException)) {
            throw class07878;
         }

         class06711.N.error("Error upgrading chunk {}", var3, throwable);
      }

      if (flag) {
         this.L.b++;
      } else {
         this.L.j++;
      }

      return flag;
   }

   public void N() {
      this.L.T = 0;
      this.L.s = 0;
      this.L.b = 0;
      this.L.j = 0;
      List<class06701> list = this.y();
      if (this.L.s != 0) {
         float f = this.L.T;
         this.L.n = this.u;

         while (this.L.m) {
            boolean var3 = false;
            float f1 = 0.0F;

            for (class06701 class06701x : list) {
               class05946<class07299> class05946 = class06701x.N();
               ListIterator<class06699> listiterator = class06701x.L();
               class06172 class06172 = class06701x.y();
               if (listiterator.hasNext()) {
                  class06699 class06699 = listiterator.next();
                  boolean flag1 = true;

                  for (class07321 class07321 : class06699.y()) {
                     flag1 = flag1 && this.N(class05946, class06172, class07321);
                     var3 = true;
                  }

                  if (this.L.U) {
                     if (flag1) {
                        this.N(class06699.N());
                     } else {
                        class06711.N.error("Failed to convert region file {}", class06699.N().N());
                     }
                  }
               }

               float f2 = listiterator.nextIndex() / f;
               this.L.v.put(class05946, f2);
               f1 += f2;
            }

            this.L.P = f1;
            if (!var3) {
               break;
            }
         }

         this.L.n = this.i;

         for (class06701 class06701 : list) {
            try {
               class06701.y().close();
            } catch (Exception exception) {
               class06711.N.error("Error upgrading chunk", exception);
            }
         }
      }
   }

   protected abstract class06172 N(class02277 var1, Path var2);
}
