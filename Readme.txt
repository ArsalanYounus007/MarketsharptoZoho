Procedure to make program work.
1)Open customauthenticationhelper and check your authentication ID and Secret ID
2)Open config file and check your Zoho Databasename, LOGINEMAILID, AUTHTOKEN
3)Open Deletedata file and write checkcriteria for data you want to delete and upload again. (i.e (\"Region\" = 'West') and (\"Product Category\" = 'Stationary'))
4)Open marketsharpclient and run it. (check your dependencies if it says file are missing or unresolved error).
5)Build your project using any Java project builder like ANT or MAVEN (I would suggest MAVEN as it is better in handling dependencies)
6)Use you jar file in any CRON job.

