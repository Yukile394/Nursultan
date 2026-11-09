package minecraft;

import Nursultan.class09446;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01211 {
   private final class01224 N;
   private final class06069 y;
   private int L;
   private int u;

   private void L(List<class01230> var1, class01200 var2) {
      var2.y = var2.y.method_10079(var2.N.N(class07211.field_11035), -1);
      var1.add(new class01230(this.N, "wall_corner", var2.y, var2.N));
      var2.y = var2.y.method_10079(var2.N.N(class07211.field_11035), -7);
      var2.y = var2.y.method_10079(var2.N.N(class07211.field_11039), -6);
      var2.N = var2.N.N(class06993.field_11463);
   }

   public class01211(class01224 var1, class06069 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   private void u(List<class01230> var1, class01200 var2) {
      var2.y = var2.y.method_10079(var2.N.N(class07211.field_11035), 6);
      var2.y = var2.y.method_10079(var2.N.N(class07211.field_11034), 8);
      var2.N = var2.N.N(class06993.field_11465);
   }

   private void y(List<class01230> var1, class01200 var2) {
      var1.add(new class01230(this.N, var2.L, var2.y.method_10079(var2.N.N(class07211.field_11034), 7), var2.N));
      var2.y = var2.y.method_10079(var2.N.N(class07211.field_11035), 8);
   }

   private void N(List<class01230> var1, class07209 var2, class06993 var3, class07211 var4, class01216 var5) {
      class06993 class06993 = class06993.field_11467;
      String s = var5.N(this.y);
      if (var4 != class07211.field_11034) {
         if (var4 == class07211.field_11043) {
            class06993 = class06993.N(class06993.field_11465);
         } else if (var4 == class07211.field_11039) {
            class06993 = class06993.N(class06993.field_11464);
         } else if (var4 == class07211.field_11035) {
            class06993 = class06993.N(class06993.field_11463);
         } else {
            s = var5.y(this.y);
         }
      }

      class07209 class07209x = class01207.N(new class07209(1, 0, 0), class07111.field_11302, class06993, 7, 7);
      class06993 = class06993.N(var3);
      class07209x = class07209x.method_10070(var3);
      class07209 class07209x = var2.method_10069(class07209x.method_10263(), 0, class07209x.method_10260());
      var1.add(new class01230(this.N, s, class07209x, class06993));
   }

   private void N(List<class01230> var1, class07209 var2, class06993 var3, class07211 var4, class07211 var5, class01216 var6, boolean var7) {
      if (var5 == class07211.field_11034 && var4 == class07211.field_11035) {
         class07209 class07209 = var2.method_10079(var3.N(class07211.field_11034), 1);
         var1.add(new class01230(this.N, var6.N(this.y, var7), class07209, var3));
      } else if (var5 == class07211.field_11034 && var4 == class07211.field_11043) {
         class07209 class07209x = var2.method_10079(var3.N(class07211.field_11034), 1);
         class07209x = class07209x.method_10079(var3.N(class07211.field_11035), 6);
         var1.add(new class01230(this.N, var6.N(this.y, var7), class07209x, var3, class07111.field_11300));
      } else if (var5 == class07211.field_11039 && var4 == class07211.field_11043) {
         class07209 class07209xx = var2.method_10079(var3.N(class07211.field_11034), 7);
         class07209xx = class07209xx.method_10079(var3.N(class07211.field_11035), 6);
         var1.add(new class01230(this.N, var6.N(this.y, var7), class07209xx, var3.N(class06993.field_11464)));
      } else if (var5 == class07211.field_11039 && var4 == class07211.field_11035) {
         class07209 class07209xxxxxx = var2.method_10079(var3.N(class07211.field_11034), 7);
         var1.add(new class01230(this.N, var6.N(this.y, var7), class07209xxxxxx, var3, class07111.field_11301));
      } else if (var5 == class07211.field_11035 && var4 == class07211.field_11034) {
         class07209 class07209xxx = var2.method_10079(var3.N(class07211.field_11034), 1);
         var1.add(new class01230(this.N, var6.N(this.y, var7), class07209xxx, var3.N(class06993.field_11463), class07111.field_11300));
      } else if (var5 == class07211.field_11035 && var4 == class07211.field_11039) {
         class07209 class07209xxxxxxx = var2.method_10079(var3.N(class07211.field_11034), 7);
         var1.add(new class01230(this.N, var6.N(this.y, var7), class07209xxxxxxx, var3.N(class06993.field_11463)));
      } else if (var5 == class07211.field_11043 && var4 == class07211.field_11039) {
         class07209 class07209xxxxxxxx = var2.method_10079(var3.N(class07211.field_11034), 7);
         class07209xxxxxxxx = class07209xxxxxxxx.method_10079(var3.N(class07211.field_11035), 6);
         var1.add(new class01230(this.N, var6.N(this.y, var7), class07209xxxxxxxx, var3.N(class06993.field_11463), class07111.field_11301));
      } else if (var5 == class07211.field_11043 && var4 == class07211.field_11034) {
         class07209 class07209xxxxxxxxx = var2.method_10079(var3.N(class07211.field_11034), 1);
         class07209xxxxxxxxx = class07209xxxxxxxxx.method_10079(var3.N(class07211.field_11035), 6);
         var1.add(new class01230(this.N, var6.N(this.y, var7), class07209xxxxxxxxx, var3.N(class06993.field_11465)));
      } else if (var5 == class07211.field_11035 && var4 == class07211.field_11043) {
         class07209 class07209xxxxxxxxxx = var2.method_10079(var3.N(class07211.field_11034), 1);
         class07209xxxxxxxxxx = class07209xxxxxxxxxx.method_10079(var3.N(class07211.field_11043), 8);
         var1.add(new class01230(this.N, var6.y(this.y, var7), class07209xxxxxxxxxx, var3));
      } else if (var5 == class07211.field_11043 && var4 == class07211.field_11035) {
         class07209 class07209xxxxxxxxxxx = var2.method_10079(var3.N(class07211.field_11034), 7);
         class07209xxxxxxxxxxx = class07209xxxxxxxxxxx.method_10079(var3.N(class07211.field_11035), 14);
         var1.add(new class01230(this.N, var6.y(this.y, var7), class07209xxxxxxxxxxx, var3.N(class06993.field_11464)));
      } else if (var5 == class07211.field_11039 && var4 == class07211.field_11034) {
         class07209 class07209xxxx = var2.method_10079(var3.N(class07211.field_11034), 15);
         var1.add(new class01230(this.N, var6.y(this.y, var7), class07209xxxx, var3.N(class06993.field_11463)));
      } else if (var5 == class07211.field_11034 && var4 == class07211.field_11039) {
         class07209 class07209xxxxx = var2.method_10079(var3.N(class07211.field_11039), 7);
         class07209xxxxx = class07209xxxxx.method_10079(var3.N(class07211.field_11035), 6);
         var1.add(new class01230(this.N, var6.y(this.y, var7), class07209xxxxx, var3.N(class06993.field_11465)));
      } else if (var5 == class07211.field_11036 && var4 == class07211.field_11034) {
         class07209 class07209xxxxxxxxxxxx = var2.method_10079(var3.N(class07211.field_11034), 15);
         var1.add(new class01230(this.N, var6.L(this.y), class07209xxxxxxxxxxxx, var3.N(class06993.field_11463)));
      } else if (var5 == class07211.field_11036 && var4 == class07211.field_11035) {
         class07209 class07209xxxxxxxxxxxxx = var2.method_10079(var3.N(class07211.field_11034), 1);
         class07209xxxxxxxxxxxxx = class07209xxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11043), 0);
         var1.add(new class01230(this.N, var6.L(this.y), class07209xxxxxxxxxxxxx, var3));
      }
   }

   private void N(List<class01230> var1, class07209 var2, class06993 var3, class01216 var4) {
      class07209 class07209 = var2.method_10079(var3.N(class07211.field_11034), 1);
      var1.add(new class01230(this.N, var4.i(this.y), class07209, var3, class07111.field_11302));
   }

   private void N(List<class01230> var1, class07209 var2, class06993 var3, class07211 var4, class07211 var5, class01216 var6) {
      byte b0 = 0;
      byte b1 = 0;
      class06993 class06993 = var3;
      class07111 class07111 = class07111.field_11302;
      if (var5 == class07211.field_11034 && var4 == class07211.field_11035) {
         b0 = -7;
      } else if (var5 == class07211.field_11034 && var4 == class07211.field_11043) {
         b0 = -7;
         b1 = 6;
         class07111 = class07111.field_11300;
      } else if (var5 == class07211.field_11043 && var4 == class07211.field_11034) {
         b0 = 1;
         b1 = 14;
         class06993 = var3.N(class06993.field_11465);
      } else if (var5 == class07211.field_11043 && var4 == class07211.field_11039) {
         b0 = 7;
         b1 = 14;
         class06993 = var3.N(class06993.field_11465);
         class07111 = class07111.field_11300;
      } else if (var5 == class07211.field_11035 && var4 == class07211.field_11039) {
         b0 = 7;
         b1 = -8;
         class06993 = var3.N(class06993.field_11463);
      } else if (var5 == class07211.field_11035 && var4 == class07211.field_11034) {
         b0 = 1;
         b1 = -8;
         class06993 = var3.N(class06993.field_11463);
         class07111 = class07111.field_11300;
      } else if (var5 == class07211.field_11039 && var4 == class07211.field_11043) {
         b0 = 15;
         b1 = 6;
         class06993 = var3.N(class06993.field_11464);
      } else if (var5 == class07211.field_11039 && var4 == class07211.field_11035) {
         b0 = 15;
         class07111 = class07111.field_11301;
      }

      class07209 class07209 = var2.method_10079(var3.N(class07211.field_11034), b0);
      class07209 = class07209.method_10079(var3.N(class07211.field_11035), b1);
      var1.add(new class01230(this.N, var6.u(this.y), class07209, class06993, class07111));
   }

   private void N(List<class01230> var1, class07209 var2, class06993 var3, class01227 var4, @Nullable class01227 var5) {
      for (int i = 0; i < var4.y; i++) {
         for (int j = 0; j < var4.N; j++) {
            class07209 class07209xxxxxxxxxxxxxxxxxxxx = var2.method_10079(var3.N(class07211.field_11035), 8 + (i - this.u) * 8);
            class07209xxxxxxxxxxxxxxxxxxxx = class07209xxxxxxxxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11034), (j - this.L) * 8);
            boolean flag = var5 != null && class01236.N(var5, j, i);
            if (class01236.N(var4, j, i) && !flag) {
               var1.add(new class01230(this.N, "roof", class07209xxxxxxxxxxxxxxxxxxxx.method_10086(3), var3));
               if (!class01236.N(var4, j + 1, i)) {
                  class07209 class07209x = class07209xxxxxxxxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11034), 6);
                  var1.add(new class01230(this.N, "roof_front", class07209x, var3));
               }

               if (!class01236.N(var4, j - 1, i)) {
                  class07209 class07209x = class07209xxxxxxxxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11034), 0);
                  class07209x = class07209x.method_10079(var3.N(class07211.field_11035), 7);
                  var1.add(new class01230(this.N, "roof_front", class07209x, var3.N(class06993.field_11464)));
               }

               if (!class01236.N(var4, j, i - 1)) {
                  class07209 class07209x = class07209xxxxxxxxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11039), 1);
                  var1.add(new class01230(this.N, "roof_front", class07209x, var3.N(class06993.field_11465)));
               }

               if (!class01236.N(var4, j, i + 1)) {
                  class07209 class07209x = class07209xxxxxxxxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11034), 6);
                  class07209x = class07209x.method_10079(var3.N(class07211.field_11035), 6);
                  var1.add(new class01230(this.N, "roof_front", class07209x, var3.N(class06993.field_11463)));
               }
            }
         }
      }

      if (var5 != null) {
         for (int k = 0; k < var4.y; k++) {
            for (int i1 = 0; i1 < var4.N; i1++) {
               class07209 class07209xxx = var2.method_10079(var3.N(class07211.field_11035), 8 + (k - this.u) * 8);
               class07209xxx = class07209xxx.method_10079(var3.N(class07211.field_11034), (i1 - this.L) * 8);
               boolean flag1 = class01236.N(var5, i1, k);
               if (class01236.N(var4, i1, k) && flag1) {
                  if (!class01236.N(var4, i1 + 1, k)) {
                     class07209 class07209x = class07209xxx.method_10079(var3.N(class07211.field_11034), 7);
                     var1.add(new class01230(this.N, "small_wall", class07209x, var3));
                  }

                  if (!class01236.N(var4, i1 - 1, k)) {
                     class07209 class07209x = class07209xxx.method_10079(var3.N(class07211.field_11039), 1);
                     class07209x = class07209x.method_10079(var3.N(class07211.field_11035), 6);
                     var1.add(new class01230(this.N, "small_wall", class07209x, var3.N(class06993.field_11464)));
                  }

                  if (!class01236.N(var4, i1, k - 1)) {
                     class07209 class07209x = class07209xxx.method_10079(var3.N(class07211.field_11039), 0);
                     class07209x = class07209x.method_10079(var3.N(class07211.field_11043), 1);
                     var1.add(new class01230(this.N, "small_wall", class07209x, var3.N(class06993.field_11465)));
                  }

                  if (!class01236.N(var4, i1, k + 1)) {
                     class07209 class07209x = class07209xxx.method_10079(var3.N(class07211.field_11034), 6);
                     class07209x = class07209x.method_10079(var3.N(class07211.field_11035), 7);
                     var1.add(new class01230(this.N, "small_wall", class07209x, var3.N(class06993.field_11463)));
                  }

                  if (!class01236.N(var4, i1 + 1, k)) {
                     if (!class01236.N(var4, i1, k - 1)) {
                        class07209 class07209x = class07209xxx.method_10079(var3.N(class07211.field_11034), 7);
                        class07209x = class07209x.method_10079(var3.N(class07211.field_11043), 2);
                        var1.add(new class01230(this.N, "small_wall_corner", class07209x, var3));
                     }

                     if (!class01236.N(var4, i1, k + 1)) {
                        class07209 class07209x = class07209xxx.method_10079(var3.N(class07211.field_11034), 8);
                        class07209x = class07209x.method_10079(var3.N(class07211.field_11035), 7);
                        var1.add(new class01230(this.N, "small_wall_corner", class07209x, var3.N(class06993.field_11463)));
                     }
                  }

                  if (!class01236.N(var4, i1 - 1, k)) {
                     if (!class01236.N(var4, i1, k - 1)) {
                        class07209 class07209x = class07209xxx.method_10079(var3.N(class07211.field_11039), 2);
                        class07209x = class07209x.method_10079(var3.N(class07211.field_11043), 1);
                        var1.add(new class01230(this.N, "small_wall_corner", class07209x, var3.N(class06993.field_11465)));
                     }

                     if (!class01236.N(var4, i1, k + 1)) {
                        class07209 class07209x = class07209xxx.method_10079(var3.N(class07211.field_11039), 1);
                        class07209x = class07209x.method_10079(var3.N(class07211.field_11035), 8);
                        var1.add(new class01230(this.N, "small_wall_corner", class07209x, var3.N(class06993.field_11464)));
                     }
                  }
               }
            }
         }
      }

      for (int l = 0; l < var4.y; l++) {
         for (int j1 = 0; j1 < var4.N; j1++) {
            class07209 class07209xxxxxxxxxxxxxx = var2.method_10079(var3.N(class07211.field_11035), 8 + (l - this.u) * 8);
            class07209xxxxxxxxxxxxxx = class07209xxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11034), (j1 - this.L) * 8);
            boolean flag2 = var5 != null && class01236.N(var5, j1, l);
            if (class01236.N(var4, j1, l) && !flag2) {
               if (!class01236.N(var4, j1 + 1, l)) {
                  class07209 class07209x = class07209xxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11034), 6);
                  if (!class01236.N(var4, j1, l + 1)) {
                     class07209 class07209xx = class07209x.method_10079(var3.N(class07211.field_11035), 6);
                     var1.add(new class01230(this.N, "roof_corner", class07209xx, var3));
                  } else if (class01236.N(var4, j1 + 1, l + 1)) {
                     class07209 class07209xx = class07209x.method_10079(var3.N(class07211.field_11035), 5);
                     var1.add(new class01230(this.N, "roof_inner_corner", class07209xx, var3));
                  }

                  if (!class01236.N(var4, j1, l - 1)) {
                     var1.add(new class01230(this.N, "roof_corner", class07209x, var3.N(class06993.field_11465)));
                  } else if (class01236.N(var4, j1 + 1, l - 1)) {
                     class07209 class07209xx = class07209xxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11034), 9);
                     class07209xx = class07209xx.method_10079(var3.N(class07211.field_11043), 2);
                     var1.add(new class01230(this.N, "roof_inner_corner", class07209xx, var3.N(class06993.field_11463)));
                  }
               }

               if (!class01236.N(var4, j1 - 1, l)) {
                  class07209 class07209xx = class07209xxxxxxxxxxxxxx.method_10079(var3.N(class07211.field_11034), 0);
                  class07209xx = class07209xx.method_10079(var3.N(class07211.field_11035), 0);
                  if (!class01236.N(var4, j1, l + 1)) {
                     class07209 class07209xxx = class07209xx.method_10079(var3.N(class07211.field_11035), 6);
                     var1.add(new class01230(this.N, "roof_corner", class07209xxx, var3.N(class06993.field_11463)));
                  } else if (class01236.N(var4, j1 - 1, l + 1)) {
                     class07209 class07209xxx = class07209xx.method_10079(var3.N(class07211.field_11035), 8);
                     class07209xxx = class07209xxx.method_10079(var3.N(class07211.field_11039), 3);
                     var1.add(new class01230(this.N, "roof_inner_corner", class07209xxx, var3.N(class06993.field_11465)));
                  }

                  if (!class01236.N(var4, j1, l - 1)) {
                     var1.add(new class01230(this.N, "roof_corner", class07209xx, var3.N(class06993.field_11464)));
                  } else if (class01236.N(var4, j1 - 1, l - 1)) {
                     class07209 class07209xxx = class07209xx.method_10079(var3.N(class07211.field_11035), 1);
                     var1.add(new class01230(this.N, "roof_inner_corner", class07209xxx, var3.N(class06993.field_11464)));
                  }
               }
            }
         }
      }
   }

   private void N(List<class01230> var1, class01200 var2) {
      class07211 class07211 = var2.N.N(class07211.field_11039);
      var1.add(new class01230(this.N, "entrance", var2.y.method_10079(class07211, 9), var2.N));
      var2.y = var2.y.method_10079(var2.N.N(class07211.field_11035), 16);
   }

   public void N(class07209 var1, class06993 var2, List<class01230> var3, class01236 var4) {
      class01200 class01200x = new class01200();
      class01200x.y = var1;
      class01200x.N = var2;
      class01200x.L = "wall_flat";
      class01200 class01200x = new class01200();
      this.N(var3, class01200x);
      class01200x.y = class01200x.y.method_10086(8);
      class01200x.N = class01200x.N;
      class01200x.L = "wall_window";
      if (!var3.isEmpty()) {
      }

      class01227 class01227x = var4.N;
      class01227 class01227x = var4.y;
      this.L = var4.u + 1;
      this.u = var4.i + 1;
      int i = var4.u + 1;
      int j = var4.i;
      this.N(var3, class01200x, class01227x, class07211.field_11035, this.L, this.u, i, j);
      this.N(var3, class01200x, class01227x, class07211.field_11035, this.L, this.u, i, j);
      class01200 class01200xx = new class01200();
      class01200xx.y = class01200x.y.method_10086(19);
      class01200xx.N = class01200x.N;
      class01200xx.L = "wall_window";
      boolean flag = false;

      for (int k = 0; k < class01227x.y && !flag; k++) {
         for (int l = class01227x.N - 1; l >= 0 && !flag; l--) {
            if (class01236.N(class01227x, l, k)) {
               class01200xx.y = class01200xx.y.method_10079(var2.N(class07211.field_11035), 8 + (k - this.u) * 8);
               class01200xx.y = class01200xx.y.method_10079(var2.N(class07211.field_11034), (l - this.L) * 8);
               this.y(var3, class01200xx);
               this.N(var3, class01200xx, class01227x, class07211.field_11035, l, k, l, k);
               flag = true;
            }
         }
      }

      this.N(var3, var1.method_10086(16), var2, class01227x, class01227x);
      this.N(var3, var1.method_10086(27), var2, class01227x, null);
      if (!var3.isEmpty()) {
      }

      class01216[] aclass01216 = new class01216[]{new class01197(), new class01213(), new class09446()};

      for (int l2 = 0; l2 < 3; l2++) {
         class07209 class07209x = var1.method_10086(8 * l2 + (l2 == 2 ? 3 : 0));
         class01227 class01227xx = var4.L[l2];
         class01227 class01227xxx = l2 == 2 ? class01227x : class01227x;
         String s = l2 == 0 ? "carpet_south_1" : "carpet_south_2";
         String s1 = l2 == 0 ? "carpet_west_1" : "carpet_west_2";

         for (int i1 = 0; i1 < class01227xxx.y; i1++) {
            for (int j1 = 0; j1 < class01227xxx.N; j1++) {
               if (class01227xxx.N(j1, i1) == 1) {
                  class07209 class07209x = class07209x.method_10079(var2.N(class07211.field_11035), 8 + (i1 - this.u) * 8);
                  class07209x = class07209x.method_10079(var2.N(class07211.field_11034), (j1 - this.L) * 8);
                  var3.add(new class01230(this.N, "corridor_floor", class07209x, var2));
                  if (class01227xxx.N(j1, i1 - 1) == 1 || (class01227xx.N(j1, i1 - 1) & 8388608) == 8388608) {
                     var3.add(new class01230(this.N, "carpet_north", class07209x.method_10079(var2.N(class07211.field_11034), 1).method_10084(), var2));
                  }

                  if (class01227xxx.N(j1 + 1, i1) == 1 || (class01227xx.N(j1 + 1, i1) & 8388608) == 8388608) {
                     var3.add(
                        new class01230(
                           this.N,
                           "carpet_east",
                           class07209x.method_10079(var2.N(class07211.field_11035), 1).method_10079(var2.N(class07211.field_11034), 5).method_10084(),
                           var2
                        )
                     );
                  }

                  if (class01227xxx.N(j1, i1 + 1) == 1 || (class01227xx.N(j1, i1 + 1) & 8388608) == 8388608) {
                     var3.add(
                        new class01230(
                           this.N, s, class07209x.method_10079(var2.N(class07211.field_11035), 5).method_10079(var2.N(class07211.field_11039), 1), var2
                        )
                     );
                  }

                  if (class01227xxx.N(j1 - 1, i1) == 1 || (class01227xx.N(j1 - 1, i1) & 8388608) == 8388608) {
                     var3.add(
                        new class01230(
                           this.N, s1, class07209x.method_10079(var2.N(class07211.field_11039), 1).method_10079(var2.N(class07211.field_11043), 1), var2
                        )
                     );
                  }
               }
            }
         }

         String s2 = l2 == 0 ? "indoors_wall_1" : "indoors_wall_2";
         String s3 = l2 == 0 ? "indoors_door_1" : "indoors_door_2";
         ArrayList arraylist = Lists.newArrayList();

         for (int k1 = 0; k1 < class01227xxx.y; k1++) {
            for (int l1 = 0; l1 < class01227xxx.N; l1++) {
               boolean flag1 = l2 == 2 && class01227xxx.N(l1, k1) == 3;
               if (class01227xxx.N(l1, k1) == 2 || flag1) {
                  int i2 = class01227xx.N(l1, k1);
                  int j2 = i2 & 983040;
                  int k2 = i2 & 65535;
                  flag1 = flag1 && (i2 & 8388608) == 8388608;
                  arraylist.clear();
                  if ((i2 & 2097152) == 2097152) {
                     for (class07211 class07211xx : class07221.field_11062) {
                        if (class01227xxx.N(l1 + class07211xx.P(), k1 + class07211xx.T()) == 1) {
                           arraylist.add(class07211xx);
                        }
                     }
                  }

                  class07211 class07211x = null;
                  if (!arraylist.isEmpty()) {
                     class07211x = (class07211)arraylist.get(this.y.y(arraylist.size()));
                  } else if ((i2 & 1048576) == 1048576) {
                     class07211x = class07211.field_11036;
                  }

                  class07209 class07209xx = class07209x.method_10079(var2.N(class07211.field_11035), 8 + (k1 - this.u) * 8);
                  class07209xx = class07209xx.method_10079(var2.N(class07211.field_11034), -1 + (l1 - this.L) * 8);
                  if (class01236.N(class01227xxx, l1 - 1, k1) && !var4.N(class01227xxx, l1 - 1, k1, l2, k2)) {
                     var3.add(new class01230(this.N, class07211x == class07211.field_11039 ? s3 : s2, class07209xx, var2));
                  }

                  if (class01227xxx.N(l1 + 1, k1) == 1 && !flag1) {
                     class07209 class07209xxx = class07209xx.method_10079(var2.N(class07211.field_11034), 8);
                     var3.add(new class01230(this.N, class07211x == class07211.field_11034 ? s3 : s2, class07209xxx, var2));
                  }

                  if (class01236.N(class01227xxx, l1, k1 + 1) && !var4.N(class01227xxx, l1, k1 + 1, l2, k2)) {
                     class07209 class07209xxx = class07209xx.method_10079(var2.N(class07211.field_11035), 7);
                     class07209xxx = class07209xxx.method_10079(var2.N(class07211.field_11034), 7);
                     var3.add(new class01230(this.N, class07211x == class07211.field_11035 ? s3 : s2, class07209xxx, var2.N(class06993.field_11463)));
                  }

                  if (class01227xxx.N(l1, k1 - 1) == 1 && !flag1) {
                     class07209 class07209xxx = class07209xx.method_10079(var2.N(class07211.field_11043), 1);
                     class07209xxx = class07209xxx.method_10079(var2.N(class07211.field_11034), 7);
                     var3.add(new class01230(this.N, class07211x == class07211.field_11043 ? s3 : s2, class07209xxx, var2.N(class06993.field_11463)));
                  }

                  if (j2 == 65536) {
                     this.N(var3, class07209xx, var2, class07211x, aclass01216[l2]);
                  } else if (j2 == 131072 && class07211x != null) {
                     class07211 class07211xx = var4.y(class01227xxx, l1, k1, l2, k2);
                     boolean flag2 = (i2 & 4194304) == 4194304;
                     this.N(var3, class07209xx, var2, class07211xx, class07211x, aclass01216[l2], flag2);
                  } else if (j2 == 262144 && class07211x != null && class07211x != class07211.field_11036) {
                     class07211 class07211xx = class07211x.R();
                     if (!var4.N(class01227xxx, l1 + class07211xx.P(), k1 + class07211xx.T(), l2, k2)) {
                        class07211xx = class07211xx.b();
                     }

                     this.N(var3, class07209xx, var2, class07211xx, class07211x, aclass01216[l2]);
                  } else if (j2 == 262144 && class07211x == class07211.field_11036) {
                     this.N(var3, class07209xx, var2, aclass01216[l2]);
                  }
               }
            }
         }
      }
   }

   private void N(List<class01230> var1, class01200 var2, class01227 var3, class07211 var4, int var5, int var6, int var7, int var8) {
      int i = var5;
      int j = var6;
      class07211 class07211 = var4;

      do {
         if (!class01236.N(var3, i + var4.P(), j + var4.T())) {
            this.L(var1, var2);
            var4 = var4.R();
            if (i != var7 || j != var8 || class07211 != var4) {
               this.y(var1, var2);
            }
         } else if (class01236.N(var3, i + var4.P(), j + var4.T()) && class01236.N(var3, i + var4.P() + var4.M().P(), j + var4.T() + var4.M().T())) {
            this.u(var1, var2);
            i += var4.P();
            j += var4.T();
            var4 = var4.M();
         } else {
            i += var4.P();
            j += var4.T();
            if (i != var7 || j != var8 || class07211 != var4) {
               this.y(var1, var2);
            }
         }
      } while (i != var7 || j != var8 || class07211 != var4);
   }
}
