/*
 * RStudioUnitTestSuite.java
 *
 * Copyright (C) 2009-18 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client;

import org.rstudio.core.client.AnsiCodeTests;
import org.rstudio.core.client.ConsoleOutputWriterTests;
import org.rstudio.core.client.StringUtilTests;
import org.rstudio.core.client.URIUtilsTests;
import org.rstudio.core.client.VirtualConsoleTests;
import org.rstudio.core.client.dom.DomUtilsTests;
import org.rstudio.studio.client.common.r.RTokenizerTests;
import org.rstudio.studio.client.workbench.views.jobs.model.JobManagerTests;
import org.rstudio.studio.client.workbench.views.source.editors.text.assist.RChunkHeaderParserTests;
import org.rstudio.studio.client.workbench.views.terminal.TerminalLocalEchoTests;
import org.rstudio.studio.client.workbench.views.terminal.TerminalSessionSocketTests;

import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.Test;

public class RStudioUnitTestSuite extends GWTTestSuite
{
   public static Test suite()
   {
      GWTTestSuite suite = new GWTTestSuite("RStudio Unit Test Suite");
      suite.addTestSuite(RTokenizerTests.class);
      suite.addTestSuite(VirtualConsoleTests.class);
      suite.addTestSuite(ConsoleOutputWriterTests.class);
      suite.addTestSuite(StringUtilTests.class);
      suite.addTestSuite(DomUtilsTests.class);
      suite.addTestSuite(AnsiCodeTests.class);
      suite.addTestSuite(TerminalLocalEchoTests.class);
      suite.addTestSuite(TerminalSessionSocketTests.class);
      suite.addTestSuite(JobManagerTests.class);
      suite.addTestSuite(URIUtilsTests.class);
      suite.addTestSuite(RChunkHeaderParserTests.class);
      return suite;
   }
}
