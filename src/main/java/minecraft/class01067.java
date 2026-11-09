package minecraft;

import Nursultan.class09435;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01067 {
   static final Logger N = LogUtils.getLogger();
   public static final File y = new File("banned-ips.txt");
   public static final File L = new File("banned-players.txt");
   public static final File u = new File("ops.txt");
   public static final File i = new File("white-list.txt");

   public static boolean L(class02796 var0) {
      class01077 class01077 = new class01077(class01062.L, new class07408());
      if (u.exists() && u.isFile()) {
         if (class01077.L().exists()) {
            try {
               class01077.M();
            } catch (IOException ioexception1) {
               N.warn("Could not load existing file {}", class01077.L().getName(), ioexception1);
            }
         }

         try {
            List<String> list = Files.readLines(u, StandardCharsets.UTF_8);
            class01085 class01085 = new class01085(var0, class01077);
            N(var0, list, class01085);
            class01077.R();
            y(u);
            return true;
         } catch (IOException ioexception) {
            N.warn("Could not read old oplist to convert it!", ioexception);
            return false;
         } catch (class09435 class09435) {
            N.error("Conversion failed, please try again later", class09435);
            return false;
         }
      } else {
         return true;
      }
   }

   private static File M(class02796 var0) {
      return var0.N(class05071.u).toFile();
   }

   public class01067() {
      super();
   }

   public static boolean i(class02796 var0) {
      boolean flag = N();
      return flag && R(var0);
   }

   public static boolean u(class02796 var0) {
      class05152 class05152 = new class05152(class01062.u, new class07408());
      if (i.exists() && i.isFile()) {
         if (class05152.L().exists()) {
            try {
               class05152.M();
            } catch (IOException ioexception1) {
               N.warn("Could not load existing file {}", class05152.L().getName(), ioexception1);
            }
         }

         try {
            List<String> list = Files.readLines(i, StandardCharsets.UTF_8);
            class01049 class01049 = new class01049(var0, class05152);
            N(var0, list, class01049);
            class05152.R();
            y(i);
            return true;
         } catch (IOException ioexception) {
            N.warn("Could not read old whitelist to convert it!", ioexception);
            return false;
         } catch (class09435 class09435) {
            N.error("Conversion failed, please try again later", class09435);
            return false;
         }
      } else {
         return true;
      }
   }

   private static void y(File var0) {
      File file1 = new File(var0.getName() + ".converted");
      var0.renameTo(file1);
   }

   public static boolean y(class02796 var0) {
      class01086 class01086 = new class01086(class01062.y, new class07408());
      if (y.exists() && y.isFile()) {
         if (class01086.L().exists()) {
            try {
               class01086.M();
            } catch (IOException ioexception1) {
               N.warn("Could not load existing file {}", class01086.L().getName(), ioexception1);
            }
         }

         try {
            HashMap hashmap = Maps.newHashMap();
            N(y, hashmap);

            for (String s : hashmap.keySet()) {
               String[] astring = (String[])hashmap.get(s);
               Date date = astring.length > 1 ? N(astring[1], null) : null;
               String s1 = astring.length > 2 ? astring[2] : null;
               Date date1 = astring.length > 3 ? N(astring[3], null) : null;
               String s2 = astring.length > 4 ? astring[4] : null;
               class01086.N(new class01072(s, date, s1, date1, s2));
            }

            class01086.R();
            y(y);
            return true;
         } catch (IOException ioexception) {
            N.warn("Could not parse old ip banlist to convert it!", ioexception);
            return false;
         }
      } else {
         return true;
      }
   }

   static List<String> N(File var0, Map<String, String[]> var1) throws IOException {
      List<String> list = Files.readLines(var0, StandardCharsets.UTF_8);

      for (String s : list) {
         s = s.trim();
         if (!s.startsWith("#") && !s.isEmpty()) {
            String[] astring = s.split("\\|");
            var1.put(astring[0].toLowerCase(Locale.ROOT), astring);
         }
      }

      return list;
   }

   static Date N(String var0, Date var1) {
      Date date;
      try {
         date = class01060.N.parse(var0);
      } catch (ParseException parseexception) {
         date = var1;
      }

      return date;
   }

   static void N(File var0) {
      if (var0.exists()) {
         if (!var0.isDirectory()) {
            throw new class09435("Can't create directory " + var0.getName() + " in world save directory.");
         }
      } else if (!var0.mkdirs()) {
         throw new class09435("Can't create directory " + var0.getName() + " in world save directory.");
      }
   }

   @Nullable
   public static UUID N(class02796 var0, String var1) {
      if (!class05018.y(var1) && var1.length() <= 16) {
         Optional optional = var0.Nf().R().N(var1).map(class08774::N);
         if (optional.isPresent()) {
            return (UUID)optional.get();
         } else if (!var0.No() && var0.NH()) {
            ArrayList arraylist = new ArrayList();
            class01046 class01046 = new class01046(var0, arraylist);
            N(var0, Lists.newArrayList(new String[]{var1}), class01046);
            return !arraylist.isEmpty() ? ((class08774)arraylist.getFirst()).N() : null;
         } else {
            return class01487.N(var1);
         }
      } else {
         try {
            return UUID.fromString(var1);
         } catch (IllegalArgumentException illegalargumentexception) {
            return null;
         }
      }
   }

   public static boolean N(class02796 var0) {
      class05170 class05170 = new class05170(class01062.N, new class07408());
      if (L.exists() && L.isFile()) {
         if (class05170.L().exists()) {
            try {
               class05170.M();
            } catch (IOException ioexception1) {
               N.warn("Could not load existing file {}", class05170.L().getName(), ioexception1);
            }
         }

         try {
            HashMap hashmap = Maps.newHashMap();
            N(L, hashmap);
            class01070 class01070 = new class01070(var0, hashmap, class05170);
            N(var0, hashmap.keySet(), class01070);
            class05170.R();
            y(L);
            return true;
         } catch (IOException ioexception) {
            N.warn("Could not read old user banlist to convert it!", ioexception);
            return false;
         } catch (class09435 class09435) {
            N.error("Conversion failed, please try again later", class09435);
            return false;
         }
      } else {
         return true;
      }
   }

   private static void N(class02796 var0, Collection<String> var1, ProfileLookupCallback var2) {
      String[] astring = var1.stream().filter(var0x -> !class05018.y(var0x)).toArray(String[]::new);
      if (var0.NH()) {
         var0.Nf().i().findProfilesByNames(astring, var2);
      } else {
         for (String s : astring) {
            var2.onProfileLookupSucceeded(s, class01487.N(s));
         }
      }
   }

   private static boolean N() {
      boolean flag = false;
      if (L.exists() && L.isFile()) {
         flag = true;
      }

      boolean flag1 = false;
      if (y.exists() && y.isFile()) {
         flag1 = true;
      }

      boolean flag2 = false;
      if (u.exists() && u.isFile()) {
         flag2 = true;
      }

      boolean flag3 = false;
      if (i.exists() && i.isFile()) {
         flag3 = true;
      }

      if (!flag && !flag1 && !flag2 && !flag3) {
         return true;
      } else {
         N.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
         N.warn("** please remove the following files and restart the server:");
         if (flag) {
            N.warn("* {}", L.getName());
         }

         if (flag1) {
            N.warn("* {}", y.getName());
         }

         if (flag2) {
            N.warn("* {}", u.getName());
         }

         if (flag3) {
            N.warn("* {}", i.getName());
         }

         return false;
      }
   }

   public static boolean N(class05623 var0) {
      File file1 = M(var0);
      File file2 = new File(file1.getParentFile(), "playerdata");
      File file3 = new File(file1.getParentFile(), "unknownplayers");
      if (file1.exists() && file1.isDirectory()) {
         File[] afile = file1.listFiles();
         ArrayList arraylist = Lists.newArrayList();
         File[] afile1 = afile;
         int ix = afile.length;

         for (int j = 0; j < ix; j++) {
            String s = afile1[j].getName();
            if (s.toLowerCase(Locale.ROOT).endsWith(".dat")) {
               String s1 = s.substring(0, s.length() - ".dat".length());
               if (!s1.isEmpty()) {
                  arraylist.add(s1);
               }
            }
         }

         try {
            String[] astring = arraylist.toArray(new String[arraylist.size()]);
            class01075 class01075 = new class01075(var0, file2, file3, file1, astring);
            N(var0, Lists.newArrayList(astring), class01075);
            return true;
         } catch (class09435 class09435) {
            N.error("Conversion failed, please try again later", class09435);
            return false;
         }
      } else {
         return true;
      }
   }

   private static boolean R(class02796 var0) {
      File file1 = M(var0);
      if (!file1.exists() || !file1.isDirectory() || file1.list().length <= 0 && file1.delete()) {
         return true;
      } else {
         N.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
         N.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
         N.warn("** please restart the server and if the problem persists, remove the directory '{}'", file1.getPath());
         return false;
      }
   }
}
