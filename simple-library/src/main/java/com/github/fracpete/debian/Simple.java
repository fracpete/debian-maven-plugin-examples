/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Simple.java
 * Copyright (C) 2019 University of Waikato, Hamilton, New Zealand
 */

package com.github.fracpete.debian;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import com.github.fracpete.javautils.enumerate.Enumerated;
import static com.github.fracpete.javautils.Enumerate.enumerate;

public class Simple {

  public static void main(String[] args) throws Exception {
    System.out.println("# of command-line args: " + args.length);
    if (args.length > 0) {
      System.out.println("Command-line args:");
      for (Enumerated<String> arg: enumerate(args))
        System.out.println(arg.index + ": " + arg.value);
    }
    System.out.println("\nPlease press Enter...");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
  }
}
