/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.design.service;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

public class MarkownService {

	public static MarkupMultiline toMarkupMultiline(String s) {
		if(s == null) {
			return null;
		}
		return MarkupMultiline.fromMarkdown(s);
	}
	public static MarkupLine toMarkupLine(String s) {
		if(s == null) {
			return null;
		}
		return MarkupLine.fromMarkdown(s);
	}

	public static String toMarkdown(MarkupMultiline value) {
		if (value == null) {
			return null;
		} else {
			return value.toMarkdown();
		}
	}

	public static String toMarkdown(MarkupLine value) {
 		if (value == null) {
			return null;
		} else {
			return value.toMarkdown();
		}
	}

	// From https://github.com/darshandsoni/asciidoctor-skins/blob/gh-pages/css/boot-flatly.css
	// Licensed MIT License
	public static String getCSSContent(Object o) {
		return "@import url(//fonts.googleapis.com/css?family=Lato:400,700,400italic);body{font-family:Lato,\"Helvetica Neue\",Helvetica,Arial,sans-serif;font-size:15px;line-height:1.42857143;color:#2c3e50;background-color:#fff;margin-left:10%;margin-right:10%}#header{width:100%}#header>h1{border-bottom:1px solid #ddddd8;padding-bottom:8px}h1,h2,h3,h4,h5,h6{font-family:Lato,\"Helvetica Neue\",Helvetica,Arial,sans-serif;font-weight:400;line-height:1.1;color:inherit}h1,h2,h3{margin-top:21px;margin-bottom:10.5px}h4,h5,h6{margin-top:10.5px;margin-bottom:10.5px}h1{font-size:4em}h2{font-size:32px}h3{font-size:26px}h4{font-size:19px}h5{font-size:15px}h6{font-size:13px}.paragraph{margin:0 0 10.5px}p{margin:0 0 10.5px}.quoteblock{font-style:italic}blockquote{padding:10.5px 21px;margin:0 0 21px;font-size:18.75px;border-left:5px solid #ecf0f1}blockquote ol:last-child,blockquote p:last-child,blockquote ul:last-child{margin-bottom:0}.blockquote-reverse,blockquote.pull-right{padding-right:15px;padding-left:0;border-right:5px solid #ecf0f1;border-left:0;text-align:right}.blockquote-reverse .small:before,.blockquote-reverse footer:before,.blockquote-reverse small:before,blockquote.pull-right .small:before,blockquote.pull-right footer:before,blockquote.pull-right small:before{content:''}.blockquote-reverse .small:after,.blockquote-reverse footer:after,.blockquote-reverse small:after,blockquote.pull-right .small:after,blockquote.pull-right footer:after,blockquote.pull-right small:after{content:'\\00A0 \\2014'}.attribution,.cite,blockquote .small,blockquote footer,blockquote small{display:block;font-size:80%;line-height:1.42857143;color:#b4bcc2}.attribution:before,blockquote .small:before,blockquote footer:before,blockquote small:before{content:'\\2014 \\00A0'}ol,ul{margin-top:0;margin-bottom:10.5px}ol ol,ol ul,ul ol,ul ul{margin-bottom:0}a{color:#18bc9c;background-color:transparent;text-decoration:none}a:focus,a:hover{color:#18bc9c;text-decoration:underline}a:focus{outline:5px auto -webkit-focus-ring-color;outline-offset:-2px}hr{margin-top:21px;margin-bottom:21px;border:0;border-top:1px solid #ecf0f1}table{background-color:transparent;width:100%;max-width:100%;margin-bottom:21px;border-collapse:collapse}table col[class*=col-]{position:static;float:none;display:table-column}table td[class*=col-],table th[class*=col-]{position:static;float:none;display:table-cell}caption{padding-top:8px;padding-bottom:8px;color:#b4bcc2;text-align:left}thead{border-bottom:2px solid #ecf0f1}th{text-align:left;padding-left:8px}tfoot{color:#807f81;border-top:1px solid #ecf0f1}td{border-top:1px solid #ecf0f1}td p{margin:auto;padding:8px}tbody>tr:nth-of-type(odd){background-color:#f9f9f9}tbody>tr:hover{background-color:#ecf0f1}code,kbd,pre,samp{font-family:Menlo,Monaco,Consolas,\"Courier New\",monospace}code{padding:2px 4px;font-size:90%;color:#c7254e;background-color:#f9f2f4;border-radius:4px}kbd{padding:2px 4px;font-size:90%;color:#fff;background-color:#333;border-radius:0;-webkit-box-shadow:inset 0 -1px 0 rgba(0,0,0,.25);box-shadow:inset 0 -1px 0 rgba(0,0,0,.25)}kbd kbd{padding:0;font-size:100%;font-weight:700;-webkit-box-shadow:none;box-shadow:none}pre{display:block;padding:10.5px;margin:0 0 10.5px;font-size:15px;line-height:1.42857143;word-break:break-all;word-wrap:break-word;color:#333;background-color:#f5f5f5;border:1px solid #ccc;border-radius:4px}pre code{padding:0;font-size:inherit;color:inherit;white-space:pre-wrap;background-color:transparent;border-radius:0}img{max-width:100%;vertical-align:middle}#footer{margin-top:22px;padding:14px 16px;color:#fff;background-color:#2c3e50}video{max-width:100%}#toctitle{color:#fff}#toc ul{display:inline;list-style-type:none;margin:0;padding:0;overflow:hidden}#toc li{display:block}#toc a{background-color:#2c3e50;float:left;color:#fff;text-align:center;padding:14px 16px;text-decoration:none}#toc li a:hover{background-color:#1a242f;text-decoration:none}#toc:after{content:\" \";visibility:hidden;display:block;height:0;clear:both}@media all and (max-width:600px){table{width:55vw!important;font-size:3vw}}";
	}

}
