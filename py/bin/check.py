def check(sload, sstart):
	c=open(__file__ + "/##check", "r")
	j=c.readline()
	if j == "steveted0check":
		if sload == "load":
			import load as start
			start.start()
