/* Copyright 2013 SpringSource.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class Tomcat8GrailsPlugin {
	def version = '8.0.0-RC1'
	def grailsVersion = '2.3 > *'
	def scopes = [excludes: 'war']
	def title = 'Apache Tomcat 8 plugin'
	def description = 'Makes Tomcat 8.x the servlet container for Grails at development time'
	def documentation = 'http://grails.org/plugin/tomcat8'

	def license = 'APACHE'
	def organization = [name: 'SpringSource', url: 'http://www.springsource.org/']
	def developers = [
		[name: 'Burt Beckwith', email: 'bbeckwith@gopivotal.com']
	]
	def issueManagement = [system: 'JIRA', url: 'http://jira.grails.org/browse/GPTOMCAT']
	def scm = [ url: 'https://github.com/grails-plugins/grails-tomcat8-plugin' ]
}
