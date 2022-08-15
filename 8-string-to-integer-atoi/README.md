<h2><a href="https://leetcode.com/problems/string-to-integer-atoi/">8. String to Integer (atoi)</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Implement the <code style="user-select: auto;">myAtoi(string s)</code> function, which converts a string to a 32-bit signed integer (similar to C/C++'s <code style="user-select: auto;">atoi</code> function).</p>

<p style="user-select: auto;"><lclighter data-id="lgt257511490" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">The algorithm for </lclighter><code style="user-select: auto;"><lclighter data-id="lgt257511490" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">myAtoi(string s)</lclighter></code><lclighter data-id="lgt257511490" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;"> is as follows:</lclighter><div class="LinerThreadIcon LinerFirst " data-highlight-id="257511490" data-bundle-id="0" id="lgt257511490" style="background-image: url(&quot;https://photo.getliner.com/liner-service-bucket/user_photo_default/color-7/B.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div></p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Read in and ignore any leading whitespace.</li>
	<li style="user-select: auto;">Check if the next character (if not already at the end of the string) is <code style="user-select: auto;">'-'</code> or <code style="user-select: auto;">'+'</code>. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.</li>
	<li style="user-select: auto;">Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.</li>
	<li style="user-select: auto;">Convert these digits into an integer (i.e. <code style="user-select: auto;">"123" -&gt; 123</code>, <code style="user-select: auto;">"0032" -&gt; 32</code>). If no digits were read, then the integer is <code style="user-select: auto;">0</code>. Change the sign as necessary (from step 2).</li>
	<li style="user-select: auto;">If the integer is out of the 32-bit signed integer range <code style="user-select: auto;">[-2<sup style="user-select: auto;">31</sup>, 2<sup style="user-select: auto;">31</sup> - 1]</code>, then clamp the integer so that it remains in the range. Specifically, integers less than <code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup></code> should be clamped to <code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup></code>, and integers greater than <code style="user-select: auto;">2<sup style="user-select: auto;">31</sup> - 1</code> should be clamped to <code style="user-select: auto;">2<sup style="user-select: auto;">31</sup> - 1</code>.</li>
	<li style="user-select: auto;">Return the integer as the final result.</li>
</ol>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Only the space character <code style="user-select: auto;">' '</code> is considered a whitespace character.</li>
	<li style="user-select: auto;"><strong style="user-select: auto;">Do not ignore</strong> any characters other than the leading whitespace or the rest of the string after the digits.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "42"
<strong style="user-select: auto;">Output:</strong> 42
<strong style="user-select: auto;">Explanation:</strong> The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "<u style="user-select: auto;">42</u>" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-2<sup style="user-select: auto;">31</sup>, 2<sup style="user-select: auto;">31</sup> - 1], the final result is 42.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "   -42"
<strong style="user-select: auto;">Output:</strong> -42
<strong style="user-select: auto;">Explanation:</strong>
Step 1: "<u style="user-select: auto;">   </u>-42" (leading whitespace is read and ignored)
            ^
Step 2: "   <u style="user-select: auto;">-</u>42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -<u style="user-select: auto;">42</u>" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-2<sup style="user-select: auto;">31</sup>, 2<sup style="user-select: auto;">31</sup> - 1], the final result is -42.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "4193 with words"
<strong style="user-select: auto;">Output:</strong> 4193
<strong style="user-select: auto;">Explanation:</strong>
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "<u style="user-select: auto;">4193</u> with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-2<sup style="user-select: auto;">31</sup>, 2<sup style="user-select: auto;">31</sup> - 1], the final result is 4193.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= s.length &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of English letters (lower-case and upper-case), digits (<code style="user-select: auto;">0-9</code>), <code style="user-select: auto;">' '</code>, <code style="user-select: auto;">'+'</code>, <code style="user-select: auto;">'-'</code>, and <code style="user-select: auto;">'.'</code>.</li>
</ul>
</div>