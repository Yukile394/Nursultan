package Nursultan;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import minecraft.class02801;
import minecraft.class04681;
import minecraft.class05005;

public class class09943 implements class04681 {
   @Override
   public long L() {
      return this.N;
   }

   public class09943(class02801 var1, long var2, int var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.L = var4;
   }

   @Override
   public String i() {
      return "";
   }

   @Override
   public int u() {
      return this.L;
   }

   @Override
   public int y() {
      return this.u.y;
   }

   @Override
   public long N() {
      return this.u.N;
   }

   @Override
   public List<class05005> N(String var1) {
      return Collections.emptyList();
   }

   @Override
   public boolean N(Path var1) {
      return false;
   }
}
