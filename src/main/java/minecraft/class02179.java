package minecraft;

import Nursultan.class09652;
import Nursultan.class09658;
import com.mojang.brigadier.StringReader;
import it.unimi.dsi.fastutil.chars.CharList;

public interface class02179 {
   static StringReader N(String var0, int var1) {
      StringReader stringreader = new StringReader(var0);
      stringreader.setCursor(var1);
      return stringreader;
   }

   static class02315<StringReader> N(char var0, char var1) {
      return new class09652(CharList.of(var0, var1), var0, var1);
   }

   static class02315<StringReader> N(char var0) {
      return new class09658(CharList.of(var0), var0);
   }

   static class02315<StringReader> N(String var0) {
      return new class02176(var0);
   }
}
