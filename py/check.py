def(sload, sstart):
  c=open(__file__ + "/##check", "r")
  j=c.readline()
  if j == "steveted0check":
    if load == "load":
      import load as start
      start.start()
